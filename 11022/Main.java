import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        int[] Sum;
        Sum = new int[T]; //A+B의 값을 저장할 배열
         
        int[] A_array;
        A_array = new int[T];

        int[] B_array;
        B_array = new int[T];

        for(int i=0;i<T;i++){
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            A_array[i] = A;
            B_array[i] = B;
            Sum[i] = A+B;
        }

        for(int i=1;i<=T;i++){
            System.out.println("Case #"+i+": "+A_array[i-1]+" + "+B_array[i-1]+" = "+Sum[i-1]);
        }
    }
}