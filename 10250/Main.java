import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int x,y;
            String x1,y1;

            if(N%H == 0){ // N/H가 나머지가 없는 경우
                y = N/H;
                x = H - (((N/H)*H) - N);
                if(y<10){
                    y1 = ("0" + Integer.toString(y));
                    x1 = (Integer.toString(x));
                }
                else{
                    x1 = (Integer.toString(x));
                    y1 = (Integer.toString(y));
                }
                bw.write(x1+y1+"\n");
            }
            else{ // N/H가 나머지가 있어 +1을 해주어야 하는 경우
                y = N/H+1;
                x = H - (((N/H+1)*H) - N);
                if(y<10){
                    y1 = ("0" + Integer.toString(y));
                    x1 = (Integer.toString(x));
                }
                else{
                    x1 = (Integer.toString(x));
                    y1 = (Integer.toString(y));
                }
                bw.write(x1+y1+"\n");
            }

        }
        br.close();
        bw.flush();
        bw.close();   
    }
}