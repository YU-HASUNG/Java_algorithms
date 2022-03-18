import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    //BufferedReader로 입력받기!
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args)throws IOException{
        
        int count = 0;
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i<N; i++){
            //check로 이동
            if(check() == true){
                count++;
            }
        }
        System.out.println(count);
    }


    public static boolean check() throws IOException{
        //알파벳 26개의 공간을 만들어줍니다
        boolean[] check = new boolean[26];
        //prev에 앞선 문자열의 int값 저장
        int prev = 0;
        String str = br.readLine();

        for(int i=0;i<str.length();i++){
            
            //입력받은 문자열의 i자리수의 문자를 now에 저장
            int now = str.charAt(i);

            //now와 prev 비교하여 "값이 다르다면"(상관있음)
            if(prev != now){

                //혹시 now에 있던 값이 앞서 나왔던 값인지 확인
                if ( check[now -'a'] == false){
                    check[now - 'a'] =true; //나오지 않았으니 true로 바꿔줌
                    prev = now; //다음 비교를 위해 현재값으로 바꿔줌
                }

                //나왔으니 이 문자열은 '그룹단어'가 아님 false return!!!
                else{
                    return false;
                }
            }

            //now와 prev 비교하여 "값이 같다면"(상관없음)
            else{
                continue;
            }
        }
        return true;
    }
}