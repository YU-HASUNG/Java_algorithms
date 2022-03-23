import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
    
    public static boolean[] arr = new boolean[10001];

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        get_prime();

        for(int i=0;i<n;i++){
            int A = Integer.parseInt(br.readLine());
            int B = A/2;

            for(int j=B;j>0;j--){
                if(!arr[j] && !arr[A-j]){
                    bw.write(j+" "+(A-j)+"\n");
                    break;
                }
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }

    public static void get_prime(){
        arr[0] = arr[1] = true;

        for(int i=2;i<10001;i++){
            if(arr[i]){continue;}
            for(int j=i*i;j<10001;j=j+i){
                arr[j] = true;
            }
        }
    }
}