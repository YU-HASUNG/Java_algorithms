import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int copy = N;
        int i = 0;


        do{
            N = ((N%10)*10)+(((N/10)+(N%10))%10);
            i++;
        }       
        while(N!=copy);

        System.out.println(i);
    }

}