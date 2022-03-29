import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
    
    //문제의 제한조건인 1 ≤ n ≤ 123,456
    //n의 최댓값인 123456*2+1한 값을 boolean배열의 범위로 설정합니다. 
    public static boolean[] prime = new boolean[246913];
    
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        get_prime();

        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n==0) break;

            int count = 0;

            //n+1 ~ 2*n까지 prime배열이 거짓이면 count를 해줍니다.
            //count값이 소수의 값이기 때문에 출력해줍니다.
            for(int i=n+1;i<=2*n;i++){
                if(!prime[i]){count++;}
            }
            bw.write(Integer.toString(count)+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

    //prime boolean 배열에 소수가 아닌 부분을 다 true로 채워줄 것입니다.
    public static void get_prime() {
        //0과 1은 소수가 아니므로 true
        prime[0] = prime[1] = true;

        //2부터 prime.length의 제곱근
        for(int i = 2; i<=Math.sqrt(prime.length);i++){
            //이미 true가 채워져있으면 pass
            if(prime[i]){continue;}
            //j에 i의 배수를 입력해가며, 해당하는 배열에 true값을 넣어줍니다.
            for(int j=i*i;j<prime.length;j+=i){
                prime[j] = true;
            }
        }

    }
}