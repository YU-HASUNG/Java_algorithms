import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int R = Integer.parseInt(br.readLine());
        br.close();
        double radius = (double)R;

        System.out.printf("%.6f\n", Euclidean(radius));
        System.out.printf("%.6f", Taxicab(radius));
    }

    public static double Euclidean(double r){
        r = r*r*Math.PI;
        return r;
    }

    public static double Taxicab(double r){
        r = r*r*2; 
        return r;
    }
}