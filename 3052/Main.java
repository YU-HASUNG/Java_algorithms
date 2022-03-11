import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        //42로 나누었을때 만들어질 수 있는 나머지의 개수는 42개이다(0~41)
        boolean[] arr = new boolean[42];

        //크기가 42인 boolean 배열을 만들어서 10개의 입력 값의 나머지 중 해당하는 자리에 true를 넣어준다
        for(int i=0;i<10;i++){
            arr[Integer.parseInt(br.readLine())%42] = true;
        }

        //for문을 통해 전체 배열을 한바퀴 돌리면서 true인 부분이 나오면 count변수에 1을 더해준다
        int count = 0;
        for(int i=0;i<42;i++){
            if(arr[i]==true){
                count +=1;
            }
        }
        System.out.println(count); 
    }
}