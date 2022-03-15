import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine()); //총 반복횟수 입력받음
        
        StringTokenizer st = null; //문자열 나눠서 저장하기 위해서 StringTokenizer 선언

        double[] last = new double[N]; //각 줄의 %값을 저장하기 위한 배열 선언

        for(int i=0;i<N;i++){
            int sum = 0; //각 줄의 합
            int over = 0; //각 줄에서 평균을 넘는 수의 개수
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int[] array = new int[A]; //StringTokenizer을 통해 나누어진 값을 저장할 배열
            for(int j=0;j<A;j++){
                array[j] = Integer.parseInt(st.nextToken());
                sum = sum+array[j]; //각 줄의 합 구하는 중
            }
            for(int y=0;y<A;y++){
                if(array[y]>(sum/A)){
                    over = over + 1; //각 줄에서 평균을 넘는 수의 개수 구하는 중
                }
            }
            last[i] = (over/(double)A)*100; //각 줄 최종계산
        }
        for(int i=0;i<N;i++){
            System.out.printf("%.3f",last[i]);
            System.out.println("%");
        }
    }
}