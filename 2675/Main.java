import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = null;
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
        
            int num = Integer.parseInt(st.nextToken()); //첫번째 Token
            String A = st.nextToken(); //두번째 Token
                for(int j=0;j<A.length();j++){
                    for(int k=0;k<num;k++){
                        bw.write(A.charAt(j));
                    }
                }
                bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}