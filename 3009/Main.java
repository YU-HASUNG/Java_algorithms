import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] X = new int[3]; 
        int[] Y = new int[3];

        for(int i=0;i<3;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            X[i] = Integer.parseInt(st.nextToken());
            Y[i] = Integer.parseInt(st.nextToken());
        }

        if(X[0]-X[1]==0){
            System.out.print(X[2]+" ");
        }
        else if(X[1]-X[2]==0){
            System.out.print(X[0]+" ");
        }
        else{
            System.out.print(X[1]+" ");
        }

        if(Y[0]-Y[1]==0){
            System.out.println(Y[2]);
        }
        else if(Y[1]-Y[2]==0){
            System.out.println(Y[0]);
        }
        else{
            System.out.println(Y[1]);
        }
    }
}