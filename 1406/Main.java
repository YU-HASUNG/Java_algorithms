import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedList<Character> list = new LinkedList<>();
        StringTokenizer st = null;
        
        // 초기 문자열 입력
        // 초기 문자열 LinkedList 형태로 저장
        // 커서 초기 위치 지정
        String string = br.readLine();
        for(int i=0; i<string.length(); i++){
            list.add(string.charAt(i));
        }
        int cursor = string.length();

        // 명령어 개수 M 입력
        // 각 상황에 맞는 switch문 작성
        int M = Integer.parseInt(br.readLine());
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());

            switch(st.nextToken()){
                case "L":
                    if(cursor != 0){
                        cursor--;
                    }
                    break;
                case "D":
                    if(cursor < list.size()){
                        cursor++;
                    }
                    break;
                case "B":
                    if(cursor != 0){
                        list.remove(cursor-1);
                        cursor--;
                    }
                    break;
                case "P":
                    char A = (st.nextToken()).charAt(0);
                        list.add(cursor, A);                 
                    cursor++;
                    break;
                default:;
            }
        }
        for(int i=0; i<list.size(); i++){
            bw.write(list.get(i));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}