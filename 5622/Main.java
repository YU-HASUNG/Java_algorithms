import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        br.close();

        int[] Array = new int[N.length()];
        int sum = 0;
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0;i<N.length();i++){
            Array[i] = (N.charAt(i)); //알파벳의 ASCII값으로 저장
            if(Array[i] >=65 && 67 >=Array[i]){
                sum = sum + 3;
            }
            else if(Array[i] >=68 && 70 >=Array[i]){
                sum = sum + 4;
            }
            else if(Array[i] >=71 && 73 >=Array[i]){
                sum = sum + 5;
            }
            else if(Array[i] >=74 && 76 >=Array[i]){
                sum = sum + 6;
            }
            else if(Array[i] >=77 && 79 >=Array[i]){
                sum = sum + 7;
            }
            else if(Array[i] >=80 && 83 >=Array[i]){
                sum = sum + 8;
            }
            else if(Array[i] >=84 && 86 >=Array[i]){
                sum = sum + 9;
            }
            else if(Array[i] >=87 && 90 >=Array[i]){
                sum = sum + 10;
            }
        }
        
        bw.write(Integer.toString(sum));
        bw.flush();
        bw.close();
    }
}