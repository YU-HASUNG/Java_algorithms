import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        while(true){
                
                int i = scanner.nextInt();
                int j = scanner.nextInt();
                
                if((i+j)==0){
                    break;
                }

                System.out.println(i+j);
        }
    }
}