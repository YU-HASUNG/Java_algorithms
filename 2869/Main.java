import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        /*
        while(true){
            if(V <= (A*i)-(B*(i-1))){
                String string = Integer.toString(i);
                bw.write(string);
                bw.flush();
                bw.close();
                break;
            }
            else{
                i++;
            }       
        }
        */
        
        if((double)(V-B)/(A-B) == (V-B)/(A-B)){
            String string = Integer.toString((V-B)/(A-B));
            bw.write(string);
            bw.flush();
            bw.close();
        }
        else{
            String string = Integer.toString((V-B)/(A-B)+1);
            bw.write(string);
            bw.flush();
            bw.close();
        }
        
    }
}