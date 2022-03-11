import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = null;
        st = new StringTokenizer(br.readLine());
        
        br.close();

        int[] array = new int[N];

        for(int i=0;i<N;i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        int Max=0, Min=0;
        Max = array[0];
        Min = array[0];

        for(int i=1;i<N;i++){
            if(Max<=array[i]){
                Max = array[i];
            }

            if(Min>=array[i]){
                Min = array[i];
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Min + " " + Max);
        bw.flush();
        bw.close();
    }
}