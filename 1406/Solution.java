import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedList<Character> list = new LinkedList<>();
        StringTokenizer st = null;

        // 초기 문자열 입력
        // 초기 문자열 LinkedList 형태로 저장
        String string = br.readLine();
        for(int i=0; i<string.length(); i++){
            list.add(string.charAt(i));
        }
        int M = Integer.parseInt(br.readLine());

        //iterator 메소드 호출 
		ListIterator<Character> iter = list.listIterator();
		//첫 커서 위치 조정
		while(iter.hasNext()) {
			iter.next();
		}
	
		for(int i=0; i<M; i++) {
			String command = br.readLine();
			char c = command.charAt(0);
			switch(c) {
                case 'L':
                    if(iter.hasPrevious())
                        iter.previous();

                    break;
                case 'D':
                    if(iter.hasNext())
                        iter.next();

                    break;
                case 'B':
                //previous로 리스트의 이전 요소를 반환한다.    
                //remove()는 next()나 previous()에 의해 반환된 가장 마지막 요소를 리스트에서 제거한다.
                    if(iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
                    break;
                case 'P':
                    char t = command.charAt(2);
                    iter.add(t);

                    break;
                default:
                    break;
			}
		}
		for(Character chr : list) {
			bw.write(chr);
		}
		
		bw.flush();
		bw.close(); 
	}
}

