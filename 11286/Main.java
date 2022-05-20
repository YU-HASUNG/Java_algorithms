import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main{

    static PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) ->{
        if(Math.abs(o1) == Math.abs(o2))
            return o1 - o2;
        else
            return Math.abs(o1) - Math.abs(o2);
    });
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++){
            int cmd = Integer.parseInt(br.readLine());

            if(cmd == 0){
                if(pq.isEmpty()) 
                    sb.append(0).append('\n');
                else
                    sb.append(pq.poll()).append('\n');
            }
            else{
                pq.offer(cmd);
            }
        }

        System.out.println(sb);

    }
}