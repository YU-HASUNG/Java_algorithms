import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //N, A[] 입력
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            A[i] = Integer.parseInt(st.nextToken()); 
        }

        //M, B[], C[] 입력
        int M = Integer.parseInt(br.readLine());
        int[] B = new int[M];
        int[] C = new int[M]; //정답이 있을 경우 1을 담을 배열
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            B[i] = Integer.parseInt(st.nextToken()); 
        }

        //N을 바깥, M을 안으로 for문 
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(A[i] == B[j]){
                    C[j] = 1;
                }
            }
        }

        for(int i=0;i<M;i++){
            System.out.println(C[i]);
        }
    }
}