import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for(int i=1;i<=N;i++){
            for(int k=N;k>i;k--){
                System.out.print(' '); //k에 N을 대입해서, k가 i보다 작을때까지 공백을 생성해준다.
            }
            for(int j=0;j<i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}