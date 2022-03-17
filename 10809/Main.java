import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        br.close();
        int[] alpha = new int[26];

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0;i<26;i++){
            for(int j=0;j<N.length();j++){
                if((char)(97+i) == N.charAt(j)){
                    alpha[i] = j;
                    break;
                }
                else{
                    alpha[i] = -1;
                }
            }
            bw.write(alpha[i]+" ");
        }
        bw.flush();
        bw.close();
    }
}