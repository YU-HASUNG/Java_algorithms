import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

    public static int[] A;
    public static void main(String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                
        //N, A[] 입력
        int N = Integer.parseInt(br.readLine());
        A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            A[i] = Integer.parseInt(st.nextToken()); 
        }

        // 중요! A 배열을 정렬한다!!
        Arrays.sort(A);

        //M 입력
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<M;i++){

            if(binarySearch(Integer.parseInt(st.nextToken())) >= 0){
                sb.append(1).append('\n');
            }
            else{
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }

    static int binarySearch(int Key){
        
        int lo = 0;             //왼쪽 끝
        int hi = A.length - 1;  //오른쪽 끝

        while(lo <= hi){

            int mid = (lo + hi) / 2; //중간값

            if(Key < A[mid]){
                hi = mid - 1;
            }
            
            else if(Key > A[mid]){
                lo = mid + 1;
            }

            else{
                return mid;
            }
        }
        return -1;
    }
}
