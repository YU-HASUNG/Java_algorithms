import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 다른 블로그 참조 복습 */
public class Solution{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 자릿수
        String str_N = br.readLine();

        // 문자열의 길이 변수
        int N_len = str_N.length();

        // 문자열을 정수로 변환
        int N = Integer.parseInt(str_N);
        int result = 0;

        for(int i=(N - (N_len*9));i<N;i++){
            int number = i;
            int sum = 0;

            while(number != 0){
                sum += number % 10;
                number /= 10;
            }

            if(sum + i == N){
                result = i;
                break;
            }
        }

        System.out.println(result);       
    }
}