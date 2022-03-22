import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int j = 2;
        
        while(true){
            if(A == 1){
                break;
            }

            if(A%j == 0){
                A = A/j;
                bw.write(Integer.toString(j)+"\n");
            }
            else{
                j++;
            }

            if(j>A){
                break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}