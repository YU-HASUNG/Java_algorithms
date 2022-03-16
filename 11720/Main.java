import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        String A = scanner.next();

        int sum = 0;

        for(int i=0;i<N;i++){
            sum = sum + A.charAt(i)-'0'; //0은 아스키코드로 48, 빼주어야 정수계산가능
        }
        System.out.println(sum);


    }
}