import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //첫번째 입력 읽어오기
        int A = d(N); //d()함수 호출

        System.out.println(A); //최종출력
    }

    public static int d(int number){
        int num = number; //main 함수에서 받아온 i값 num에 저장 
        int cnt = 0; //한수의 개수
        
        if(num<100){ //100보다 작으면 무조건 한수이기때문에 return num
            return num;
        }
        else{
            cnt = 99;
            
            if(num==1000){ //자리수 계산을 위한 예외처리
                num = 999;
            }
            
            for(int i=100;i<=num;i++){
                int hun = i/100;
                int ten = (i/10)%10;
                int one = i%10;
                
                if((hun-ten) == (ten-one)){
                    cnt++;
                }
            }
            return cnt;
        }
        
    }
}