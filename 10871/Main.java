    import java.util.Scanner;

    public class Main{
        public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);

            int N = scanner.nextInt();
            int X = scanner.nextInt();

            int[] Array;
            Array = new int[N];


            for(int i=0;i<N;i++){
                Array[i] = scanner.nextInt(); //배열에 입력받은N개의 값을 저장 
            }

            for(int i=0;i<N;i++){
                if(Array[i]<X){
                    System.out.print(Array[i]); //X보다 작은 값들만 출력
                    System.out.print(" ");
                }
            }

        }
    }