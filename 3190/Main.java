import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

//for, if 활용하여 하다 실패한 코드 ... ...

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        //2차원 배열 생성
        //사과의 값은 true로 설정

        //뱀 길이 선언
        //뱀 좌표 선언
        //방향 선언 (홀수 = 좌우, 짝수 = 상하)
        
        //뱀 이동값 입력
        //뱀 이동값만큼 좌표값 연산
        //if (사과를 만날 경우)
        //if (벽을 만날 경우)

        boolean[][] field = new boolean[N][N];
        for(int i=0;i<K;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(st.nextToken());
            int column = Integer.parseInt(st.nextToken());
            field[row][column] = true;
        }

        int snakeLength = 1;
        ArrayList<Integer> snakeState = new ArrayList<>();
        int snakeRow = 0;
        int snakeColumn = 0;
        int snakeDirection = 1;
    
        int L = Integer.parseInt(br.readLine());
        for(int i=0;i<L;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int go = Integer.parseInt(st.nextToken());
            String direction = st.nextToken();
            
            if(snakeLength%2==1 && direction.equals("D")){
                for(int j=0;j<go;j++){
                    
                }
            }
            else if(snakeLength%2==1 && direction.equals("L")){

            }
            else if(snakeLength%2==0 && direction.equals("D")){

            }
            else if(snakeLength%2==0 && direction.equals("L")){

            }
        }






    }
}