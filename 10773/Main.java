import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Stack<Integer> stack = new Stack<Integer>();

        int k = Integer.parseInt(br.readLine());

        for(int i=0; i<k; i++){
            int number = Integer.parseInt(br.readLine());

            if(number == 0){
                stack.pop(); //맨 위의 원소 삭제
            }
            else{
                stack.push(number);
            }
        }

        int sum = 0;
        for(int o : stack){
            sum += o;
        }

        System.out.println(sum);

    }
}