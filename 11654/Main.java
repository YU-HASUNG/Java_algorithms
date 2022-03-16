import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N =br.readLine().charAt(0); // int 타입 변수에 저장함으로써 문자에 대응되는 값, 즉 아스키 코드값을 저장한다.
        br.close();

        System.out.println(N);

    }
}