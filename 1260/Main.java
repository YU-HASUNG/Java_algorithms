import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{

    static ArrayList<Integer>[] list;
    static int n;
    static boolean[] check;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        list = new ArrayList[n+1];

        // 각 정점별 ArrayList 생성
        for(int i=1; i<n+1; i++){
            list[i] = new ArrayList<Integer>();
        }
        
        // 각 정점을 나타내는 list[]에 연결되는 정점을 저장
        // ex) list[1] = {2, 3, 4}
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            list[u].add(v);
            list[v].add(u);
        }

        // list[] 정렬
        // ex) list[1] = {3, 1} -> {1, 3}
        for(int i=1; i<n+1; i++){
            Collections.sort(list[i]);
        }

        //DFS 방식
        check = new boolean[n+1];
        dfs(start);
        
        System.out.println();

        //BFS 방식
        check = new boolean[n+1];
        bfs(start);

        br.close();
    }

    private static void dfs(int x){
        if(check[x]){
            return;
        }

        check[x] = true;
        System.out.print(x+" ");
        for(int y : list[x]){
            if(!check[y])
                dfs(y);
        }
    }

    private static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        check[start] = true;

        while(!queue.isEmpty()){
            int x = queue.poll();
            System.out.print(x+" ");
            for(int y : list[x]){
                if(!check[y]){
                    check[y] = true;
                    queue.add(y);
                }
            }
        }
    }
}