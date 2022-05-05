import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Solution {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{

        ArrayDeque<Integer> deque;
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        while(T --> 0){

            String command = br.readLine(); // 명령어
            int n = Integer.parseInt(br.readLine()); // 배열 인자 개수
            
            st = new StringTokenizer(br.readLine(), "[],");
			
			deque = new ArrayDeque<Integer>();
			
			for(int i = 0; i < n; i++) {
				deque.add(Integer.parseInt(st.nextToken()));
			}

            AC(command, deque);
        }

        System.out.println(sb);
    }

    public static void AC(String command, ArrayDeque<Integer> deque){

        boolean isRight = true;

        for(char cmd : command.toCharArray()){

            if(cmd == 'R'){ // R의 경우
                isRight = !isRight;
                continue;
            }

            if(isRight){ // D의 경우 && R = true(정방향)
                
                if(deque.pollFirst() == null){ 
                    sb.append("error\n");
                    return;
                }

            }
            else{ // D의 경우 && R = false(역방향)
                if(deque.pollLast() == null){
                    sb.append("error\n");
                    return;
                }
            }

        }

        makePrintString(deque, isRight);
    }

    public static void makePrintString(ArrayDeque<Integer> deque, boolean isRight){

        sb.append('[');

        if(deque.size() > 0){

            if(isRight){ // 정방향
                sb.append(deque.pollFirst()); // 첫번째 원소부터
                while(!deque.isEmpty());{
                    sb.append(',').append(deque.pollFirst());
                }
            }
            else{ // 역방향
                sb.append(deque.pollLast()); // 마지막 원소부터
                while(!deque.isEmpty()){
                    sb.append(',').append(deque.pollLast());
                }
            }

        }

        sb.append(']').append('\n');
    }
}
