import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] arr;

    public static void main(String[] args) throws IOException{

        int n = Integer.parseInt(br.readLine());
        int sum  = sort(n);
        System.out.println(sum);

    }

    public static int sort(int n) throws IOException{

        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[n];
        int add = 0;
        int sum = 0;

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for(int i=0; i<n; i++){
            sum += arr[i]+add;
            add += arr[i]; 
        }

        return sum;
    }
}