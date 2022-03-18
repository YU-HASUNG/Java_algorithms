/*
==============================  
        성공한 풀이
==============================
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String alpha = br.readLine(); //입력
        br.close(); //입력 종료
        int count = 0; //알파벳 수

        for(int i=alpha.length()-1;i>=0;i--){
            switch (alpha.charAt(i)){
                case '=': 
                if(i>0){
                    //'='앞에 's' or 'c'가 있는 경우
                    if(alpha.charAt(i-1)== 's' || alpha.charAt(i-1)== 'c'){
                        count++;
                        i--;
                        break;
                    }
                    //'='앞에 z가 있는 경우
                    else if(alpha.charAt(i-1)== 'z'){
                        //i가 2보다 크면서 '='앞에 'dz'가 있는 경우
                        if(i >= 2 && alpha.charAt(i-2)== 'd'){
                            count++;
                            i--;
                            i--;
                            break;
                        }
                        //'='앞에 'z'만 있는 경우
                        else{
                            count++;
                            i--;
                            break;
                        }
                    }
                    //'='앞에 유효한 크로아티아 문자가 없는 경우
                    else{
                        count++;
                        break;
                    }
                }
                else{
                    count++;
                    break;
                }

                case '-':
                if(i>0){
                    //'='앞에 'd' or 'c'가 있는 경우
                    if(alpha.charAt(i-1)== 'd' || alpha.charAt(i-1)== 'c'){
                        count++;
                        i--;
                        break;
                    }
                    //'='앞에 유효한 크로아티아 문자가 없는 경우
                    else{
                        count++;
                        break;
                    }
                }
                else{
                    count++;
                    break;
                }

                case 'j':
                if(i>0){
                    //'='앞에 'l' or 'n'이 있는 경우
                    if(alpha.charAt(i-1)== 'l' || alpha.charAt(i-1)== 'n'){
                        count++;
                        i--;
                        break;
                    }
                    //'='앞에 유효한 크로아티아 문자가 없는 경우
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
