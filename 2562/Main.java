import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[9];

        for(int i=0;i<9;i++){
            array[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        int Max = 0;
        Max = array[0];
        int MaxNum = 1;

        for(int j=1;j<9;j++){
            if(Max <= array[j]){
                Max = array[j];
                MaxNum = j+1;
            }
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Max+"\n"+MaxNum);
        bw.flush();
        bw.close();
    }
}