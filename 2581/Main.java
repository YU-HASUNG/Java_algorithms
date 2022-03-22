import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        int composite = 0;
        int sum = 0;
        int min = 10000;

        if(A == 1){
            A = 2;
        }

        for(int i=A;i<=B;i++,A++){
            
            for(int j=2;j<A;j++){
                if(A%j == 0){
                    composite++;
                }
            }

            if(composite <= 0){
                sum = sum + A;
                if(min > A){
                    min = A;
                }
            }
            composite = 0;
        }

        if(sum == 0){
            System.out.println("-1");
        }
        else{
            System.out.println(sum);
            System.out.println(min);
        }
        

    }
}