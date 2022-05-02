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
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 숫자를 담을 LinkedList 선언
        LinkedList<Integer> deque = new LinkedList<>();
        int count = 0;

        // 숫자 입력
        for(int i=1; i<N+1; i++){
            deque.add(i);
        }

        // 뽑을 숫자를 담을 배열 선언
        int seq[] = new int[M];

        // 뽑을 숫자 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            int num =  Integer.parseInt(st.nextToken());
            seq[i] = num;
        }

        
        for(int i=0;i<M;i++){

            int target_idx = deque.indexOf(seq[i]);
            int mid;

            if(deque.size()%2 == 0){
                mid = deque.size()/2-1;
            }
            else{
                mid = deque.size()/2;
            }

            if(target_idx <= mid){
                for(int j=0;j<target_idx;j++){
                    int temp = deque.pollFirst();
                    deque.offerLast(temp);
                    count++;
                }
            }
            else{
                for(int j=0;j<deque.size() - target_idx;j++){
                    int temp = deque.pollLast();
                    deque.offerFirst(temp);
                    count++;
                }
            }
            deque.pollFirst();
            
        }

        br.close();
        bw.write(count+"");
        bw.flush();
        bw.close();
    }
}