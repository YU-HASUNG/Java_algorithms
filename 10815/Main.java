import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
    // 1. N입력
    // 2. N개 숫자입력 및 저장
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arrN = new int[n];
    for(int i=0; i<n; i++){
        arrN[i] = Integer.parseInt(st.nextToken());
    }

    // 3. M입력
    // 4. M개 숫자입력 및 저장
    int m = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    int[] arrM = new int[m];
    for(int i=0; i<m; i++){
        arrM[i] = Integer.parseInt(st.nextToken());
    }


    // 5. for문 통해 검사
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            if(arrM[i] == arrN[j]){
                arrM[i] = 1;
                continue;
            }
        }
        if(arrM[i] != 1){
            arrM[i] = 0;
        }
    }

    // 6. 출력
    for(int i=0; i<m; i++){
        System.out.print(arrM[i]+" ");
    }
    }
}