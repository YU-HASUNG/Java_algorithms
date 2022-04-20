import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        Stack<Character> stack = new Stack<>();

        int result = 0;
        for(int i=0; i<line.length(); i++){
            
            if(line.charAt(i) == '('){
                stack.push('(');
            }

            if(line.charAt(i) == ')'){
                stack.pop();

                if(line.charAt(i-1) == '('){
                    result += stack.size();
                }
                else{
                    result++;
                }
            }
        }

        bw.write(result+"");
        bw.flush();
        br.close();
        bw.close();
    }
}