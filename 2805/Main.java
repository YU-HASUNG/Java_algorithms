import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/*
    혼자 해봤지만 틀린 답안
*/

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        int minNum = 0; //입력받는 나무의 길이 중에서 잘리지 않아도 되는 나무 중 최대길이의 나무길이ㅋㅋ
        int range = 0; //배열 안에서의 minNum의 위치를 저장
        int sum = 0; // 합
        
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Integer[] arr = new Integer[n];

        //배열에 나무길이 저장
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //내림차순 정렬
        Arrays.sort(arr,Collections.reverseOrder()); 

        // 굳이 자를 필요없는 나무를 구하기 위한 식 입니다.
        // ex) 필요한 나무의 길이가 7입니다.
        // arr = {20, 17, 13, 10}의 나무가 있다면,
        // (arr[1] - 7) + (arr[2] - 7) > arr[3] =>
        // (20-7) + (17 - 7) > 13
        // 위와같은 경우 13은 무조건 자를 필요가 없습니다.

        for(int i=0; i<n-1; i++){
            sum = sum + arr[i];
            if(sum-(i+1)*arr[i+1]>=arr[i+1] && i!=0){
                minNum = arr[i+1];
                range = i+1;
                break;
            }
        }

        sum =0;
        while(true){
            sum =0;
            for(int i=0; i<range; i++){
                sum = sum + (arr[i]-minNum);
            }
            if(sum <= m){
                break;
            }
            minNum++;
        }
        System.out.println(minNum);
    }
}