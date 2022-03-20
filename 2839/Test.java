import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        br.close();
        int result = Cal(n);

        System.out.println(result);

    }

    static int Cal(int n) {
    
        if(n == 4){
            return -1;
        }
        else if(n%5 == 0){
            return n/5;
        }
        else if((n%5)%3 == 0){
            return (n/5)+1;
        }
        else if(((n%5)+5)%3 == 0){
            return ((n/5)-1) + (((n%5)+5)/3);
        }
        else if(n%3 == 0){
            return n/3;
        }
        else{
            return -1;
        }
    }
}