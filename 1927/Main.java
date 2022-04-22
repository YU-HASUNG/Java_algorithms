import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 우선순위 큐 PriorityQueue
        // 우선순위 큐에 값을 넣었다 빼면 자동적으로 가장 작은 값이 나온다
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            int Num = Integer.parseInt(br.readLine());

            if(Num != 0){
                pq.add(Num);
            }
            else if(pq.isEmpty()){
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