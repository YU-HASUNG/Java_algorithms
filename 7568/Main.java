import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        // 1. 사람 수 n 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        // 2. weight, height, number 배열 생성 및 저장(for문)
        int[] weight = new int[n];
        int[] height = new int[n];
        int[] number = new int[n];

        for(int i=0; i<5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            weight[i] = Integer.parseInt(st.nextToken());
            height[i] = Integer.parseInt(st.nextToken());
            number[i] = 1;
        }
        
        // 3. 자신보다 weight, height이 큰 사람의 개수 number에 저장(for문)
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(i!=j){
                    if(weight[i]>weight[j] && height[i]>height[j]){
                        number[j]++;
                    }
                }
            }
        }

        // 4. number배열 출력
        for(int i=0; i<n; i++){
            System.out.print(number[i]+" ");
        }
    }
}
