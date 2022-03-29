import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        stack = new int[N];

        while(N-- > 0){
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {

                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                
                case "size":
                    sb.append(size()).append('\n');
                    break;

                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                
                case "top":
                    sb.append(top()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void push(int item){
        //stack에 item 저장
        stack[size] = item;
        size++;
    }

    public static int pop() {
        //size 0이면 (비어있으면) -1 return
        if(size == 0){
            return -1;
        }
        //최근 stack return
        else{
            int res = stack[size - 1];
            stack[size - 1] = 0; //그 자리 초기화
            size --;
            return res;
        }
    }

    public static int size() { //size return
        return size;
    }

    public static int empty() { //empty상태 return
        if(size == 0){
            return 1;
        }
        else{
            return 0;
        }
    } 

    public static int top() { //top return
        if(size == 0){
            return -1;
        }
        else{
            return stack[size -1];
        }
    }
}