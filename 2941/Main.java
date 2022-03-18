/*
==============================  
        실패한 풀이
==============================
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String alpha = br.readLine(); //입력
        br.close(); //입력 종료
        int count = 0; //알파벳 수
        
        for(int i=0;i<alpha.length();i++){ //입력받은 값의 길이만큼 반복
            switch (alpha.charAt(i)){ //입력받의 값의 한 단어씩 비교
                case 'c':
                        if(i != alpha.length()-1){
                            if(alpha.charAt(i+1) == '=' || alpha.charAt(i+1) == '-'){
                                count++;
                                i++;
                                break;
                            }
                            else{
                                count++;
                                break;
                            }
                        }
                        else{
                            count++;
                            break;
                        }
                    
                case 'd':
                        if(i != alpha.length()-1 && i != alpha.length()-2){
                            if(alpha.charAt(i+1) == 'z' && alpha.charAt(i+2) == '='){
                                count++;
                                i++;
                                i++;
                                break;
                            }
                            else{
                                count++;
                                break;
                            }
                        }
                        else if(i != alpha.length()-1){
                            if(alpha.charAt(i+1) == '-'){
                                count++;
                                i++;
                                break;
                            }
                            else{
                                count++;
                                break;
                            }
                        }
                        else{
                            count++;
                            break;
                        }
                case 'l': case 'n':
                        if(i != alpha.length()-1){
                            if(alpha.charAt(i+1) == 'j'){
                                count++;
                                i++;
                                break;
                            }
                            else{
                                count++;
                                break;
                            }
                        }
                        else{
                            count++;
                            break;
                        }
                case 's': case 'z':
                        if(i != alpha.length()-1){
                            if(alpha.charAt(i+1) == '='){
                                count++;
                                i++;
                                break;
                            }
                            else{
                                count++;
                                break;
                            }
                        }
                        else{
                            count++;
                            break;
                        }
                default:
                        count++;
                        break;
            }
        }
        System.out.println(count);
    }
}