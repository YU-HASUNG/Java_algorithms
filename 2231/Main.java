import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        // 각 자리수의 값을 담을 배열 선언
        int[] array = new int[N.length()];
        // 각 자리수가 9인 최대의 경우를 생각
        int temp = 9*N.length()-1;

        
        int number = Integer.parseInt(N);
        int startNumber = number - temp;
        
        while(true){

            
            if(number<10){
                if(number%2 == 0){
                    System.out.println(number/2);    
                }
                else{
                    System.out.println('0');
                }
                break;
            }
            
            //자리수의 합 선언
            int sum = 0;
            //각 자리수를 구하기 위한 String으로의 형변환
            String st = String.valueOf(startNumber);
            
            // 각 자리수 배열에 저장 후 더하기
            for(int i=0;i<st.length();i++){
                array[i] = st.charAt(i)-'0';
                sum = array[i]+sum;
            }

            if(startNumber+sum == number){
                System.out.println(startNumber);
                break;
            }
            
            if(startNumber>=number){
                System.out.println('0');
                break;
            }
            
            startNumber++;
        }
    }
}