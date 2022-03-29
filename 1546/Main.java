import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int A = Integer.parseInt(br.readLine());
        double Max = 0;
        double Sum = 0;
        double[] array = new double[A];

    
        StringTokenizer st = null;
        st = new StringTokenizer(br.readLine());

        for(int i=0;i<A;i++){
            array[i] = Integer.parseInt(st.nextToken());
            if(Max <= array[i]){
                Max = array[i];
            }
        }

        for(int i=0;i<A;i++){
            array[i] = (array[i]/Max)*100;
        }

        for(int i=0;i<A;i++){
            Sum = Sum + array[i];
        }

        System.out.println(Sum/A);
    }
}