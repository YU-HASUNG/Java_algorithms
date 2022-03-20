import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*  n호
    0   1   2   3
 k층-------------------------------------------
 6
 5
 4
 3
 2  1   4   10  20
 1  1   3   6   10
 0  1   2   3   4
   ---------------------------------------------

1. T개의 case

1-1. k
1-2. n

.
.
.

*사실상 층/호수는 k/n개로 제한된다고 생각


ex)
1 = T
1 = k
3 = n

0층 1호 = 1
0층 2호 = 2
0층 3호 = 3

1층 1호 = 1 (1)
1층 2호 = 3 (1+2)
1층 3호 = 6 (1+2+3)

2층 1호 = 1 (1)
2층 2호 = 4 (1+3)
2층 3호 = 10 (1+3+6)


*n이 KeyPoint / n에 대한 식으로 작성해보자
*0층은 숫자 항상 고정

if(n==1){
    result = 1;
}
else{
    
}
*/
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        
        int[][] Arr = new int[15][15];

        for(int y=0;y<T;y++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            for(int i=0;i<15;i++){
                Arr[i][1] = 1; //i가 높이
                Arr[0][i] = i; //j가 넓이
            }

            for(int i=1;i<=k;i++){ //i가 높이
                for(int j=1;j<=n;j++){ //j가 넓이
                    Arr[i][j] = Arr[i-1][j] + Arr[i][j-1];
                }
            }

            bw.write(Integer.toString(Arr[k][n])+"\n");

        }

        br.close();
        bw.flush();
        bw.close();

    }
}