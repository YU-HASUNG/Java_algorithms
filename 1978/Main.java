import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int composite = 0;
        int result = 0;

        for(int i=0;i<N;i++){
            int A = Integer.parseInt(st.nextToken());

                if(A == 1){
                    composite++;
                }
                for(int j=2;j<A;j++){
                    if(A%j == 0){
                        composite++;
                    }
                }
            
            if(composite <= 0){
                result++;
            }
            composite = 0;
        }

        System.out.println(result);
        
    }
}