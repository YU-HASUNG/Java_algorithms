import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st = null;

    //시간과 방향 입력받을 Map형식의 moveInfo 선언
    static Map<Integer, String> moveInfo = new HashMap<>();

    //뱀의 이동을 결정하는 배열
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    //사과의 위치를 담을 2차원배열 map
    static int[][] map;

    static int N;

    public static void main(String[] args) throws IOException{
        
        N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        map = new int[N][N];

        //사과의 위치를 map에 저장
        for(int i=0;i<K;i++){
            st = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(st.nextToken())-1;
            int column = Integer.parseInt(st.nextToken())-1;
            map[row][column] = 1;
        }

        //시간과 방향을 moveInfo에 입력
        int L = Integer.parseInt(br.readLine());
        for(int i=0; i<L; i++){
            st = new StringTokenizer(br.readLine());
            int time = Integer.parseInt(st.nextToken());
            String direction = st.nextToken();
            moveInfo.put(time, direction);
        }
        System.out.println(moveInfo);
        
        solve();
    }

    static void solve() throws IOException{
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        
        int time = 0; // 총 시간
        int px = 0; // 뱀의 x좌표(열)
        int py = 0; // 뱀의 y좌표(행)
        int d = 0; // 방향 지시 변수 

        while(true){
            int nx = px + dx[d];
            int ny = py + dy[d];
            time++;
            System.out.println("nx : "+nx);
            System.out.println("ny : "+ny);

            //벽에 부딪히는 경우
            if(nx<0 || ny<0 || nx>N-1 || ny>N-1){
                break;
            }

            //몸통에 부딪히는 경우
            if(q.contains(ny*N + nx)){
                break;
            }

            //뱀 이동 시작
            if(map[ny][nx] == 1){
                map[ny][nx] = 0;
                q.add(ny*N + nx);
                System.out.println(q.toString());
            }
            else{
                q.add(ny*N + nx);
                q.poll();
                System.out.println(q.toString());
            }

            //방향 전환
            if(moveInfo.containsKey(time)){
                String data = moveInfo.get(time);
                if(data.equals("D")){
                    d += 1; 
                    if(d == 4){
                        d = 0;
                    }
                }
                else{
                    d -= 1;
                    if(d == -1){
                        d = 3;
                    }
                }
            }
            px = nx;
            py = ny;
        }

        br.close();
        bw.write(time+"");
        bw.flush();
        bw.close();

    }
}
