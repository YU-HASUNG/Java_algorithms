import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] poke = new String[n];
        int[] num = new int[n];

        for(int i=0; i<n; i++){
            poke[i] = br.readLine();
            num[i] = i+1;
        }

        for(int i=0; i<m; i++){
            String temp = br.readLine();

            if(!(Character.isDigit(temp.charAt(0)))){
                int number = Arrays.asList(poke).indexOf(temp);
                System.out.println(num[number]);
            }
            else{
                int number = Integer.parseInt(temp);
                System.out.println(poke[number-1]);
            }
        }
    }
}