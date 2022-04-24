import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N =  Integer.parseInt(br.readLine());

        // Collections.reverseOrder() 로 내림차순으로 변경
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<N; i++){
            int num =  Integer.parseInt(br.readLine());
            
            // 0보다 크다면 추가
            // 비어있다면 0 출력
            // 0이라면 큰 수 출력
            if(num > 0){
                pq.add(num);
            }
            else if(num == 0 && pq.isEmpty()){
                bw.write(0+"\n");
            }
            else{
                bw.write(pq.poll()+"\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}