import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();

        int[] array = new int[26]; //a~z까의 알파벳 배열생성

        int Max = 0; //가장 많이 나온 알파뱃 개수저장
        int Sum = 0; //알파뱃 개수 중복 체크
        int Address = 0; //가장 많이 나온 알파뱃 주소

        for(int i=0;i<N.length();i++){ //입력받은 문자열의 길이만큼 for문을 돌려준다
            for(int j=65;j<91;j++){ //알파벳이 대문자일 경우
                if(N.charAt(i) == (char)j){ //알파벳이 같다면
                    array[j-65] = array[j-65]+1; //해당 array에 1을 더해준다
                }
            }
            for(int j=97;j<123;j++){ //알파벳이 소문자일 경우
                if(N.charAt(i) == (char)j){ //알파벳이 같다면
                    array[j-97] = array[j-97]+1; //해당 array에 1을 더해준다
                }
            }
        }
        for(int i=0;i<26;i++){ //가장 많이 나온 알파뱃 주소를 알아낸다 
            if(array[i] > Max){
                Max = array[i];
                Address = i; //array의 주소를 저장한다
            }
        }
        for(int i=0;i<26;i++){ //가장 많이 나온 알파뱃의 개수가 중복되는지 체크한다
            if(array[i] == Max){
                Sum = Sum + 1;
            }
        }
        switch (Sum) { 
            case 1: //Sum이 1이어서 알파뱃의 개수가 중복되지 않는다면, 
                System.out.println((char)(65+Address)); //(char)65 = 'A' 에서 몇번이나 증가해야 하는지(Address) 계산하여 출력해준다
                break;
        
            default:
                System.out.println("?"); //Sum이 하나이상(가장 많이 나온 알파뱃의 개수가 중복) 나왓다면 '?'출력
                break;
        }

    }
}