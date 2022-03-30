import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Queue<Integer> queue = new LinkedList<>();
        
        int N = Integer.parseInt(br.readLine());
        int a = 0;

        for(int i=0; i<N; i++){
            
            st = new StringTokenizer(br.readLine(), " ");

            switch(st.nextToken()){

                case "push":
                    a = Integer.parseInt(st.nextToken());
                    queue.add(a);
                    break;

                case "pop":
                    System.out.println(queue.isEmpty()? -1:queue.poll());
                    break;

                case "size":
                    System.out.println(queue.size());
                    break;
                
                case "empty":
                    System.out.println(queue.isEmpty()? 1:0);
                    break;

                case "front":
                    System.out.println(queue.isEmpty()? -1:queue.peek());
                    break;
                
                case "back":
                    System.out.println(queue.isEmpty()? -1:a);
                    break;
            }
        }
    }
}