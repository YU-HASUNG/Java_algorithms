import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        int answer = 0;

        // 1. )()
        // 2. ())
        // 위의 두가지 경우를 고려해한다.
        
        // cnt를 통해 '(', ')'의 개수를 센다.
        // cnt가 음수가 되는 지점,
        // 최종 cnt가 0이 아닌 경우,
        // 위의 두가지의 경우 "NO" 를 출력한다.  

        for(int i=0;i<N;i++){
            String s = br.readLine();
            cnt = 0;
            answer = 0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j) == '('){
                    cnt++;
                }
                else if(s.charAt(j) == ')'){
                    cnt--;
                }

                if(cnt < 0){  //cnt가 0보다 작은경우
                    answer = -1;;
                }
            }
            if(cnt != 0 || answer != 0){ //최종 cnt가 0이 아니거나, cnt가 0보다 작은경우
                bw.write("NO\n");
            }
            else{
                bw.write("YES\n");
            }  
        }
        bw.flush();
        br.close();
        bw.close();
    }
}