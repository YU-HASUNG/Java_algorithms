import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
상근이와 설탕문제
5kg, 3kg 봉지 2가지
같은무게 but 최대한 적게 봉지를 들고가는 방법

첫째줄에 N이 주어진다.
(3 ≤ N ≤ 5000)

5*X + 3*Y = N


1. 5로 1번 나눈다 (N/5)
    
    -A 나머지가 5 이상으로 한번 이상 더 나눠진다 **한번 더 나눠질 수 없음,,,ㅋㅋ

        다시 1. 로 재귀호출

    -B 나머지가 5 이하로 더이상 안나눠진다

        2. 으로

    -C 나머지가 0으로 딱 떨어진다

        끝. N/5 출력


2. 1-B의 나머지를 3으로 1번 나눈다

    -A 나머지가 3 이상으로 한번 이상 더 나눠진다

        다시 2. 로

    -B 나머지가 3 이하로 더이상 안나눠진다

        -B-1 N을 5로 나눈 나머지에 5를 더하고 나눈 나머지가 딱 떨어진다 (((N%5)+5)%3) == 0

            끝. 
        
        -B-2 N을 3으로 나눈다
            
            -B-2-1 딱 떨어진다
                끝. 3/N 출력

            -B-2-2 딱 안떨어진다
                끝. -1 출력

    -C 나머지가 0으로 딱 떨어진다

        끝. (N/5) + ((N%5)/3) 출력

*/

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        br.close();
        int result = Cal(N);

        System.out.println(result);

    }

    static int Cal(int n) {
    
        while(n != 4){

        if(n%5 == 0){
            return n/5;
        }
        else{
            if((n%5)%3 == 0){
                return (n/5) + ((n%5)/3);
            }
            else{
                if((((n%5)+5)%3) == 0){
                    return ((n/5)-1) + (((n%5)+5)/3);
                }
                else{
                    if(n%3 == 0){
                        return (n/3);
                    }
                    else{
                        return -1;
                    }
                }
            }
        }
        }
        return -1;
    }
}