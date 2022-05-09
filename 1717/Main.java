import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

    // 0. 초기 값을 저장할 parent 배열 선언
    public static int[] parent;
        
        public static void main(String[] args) throws IOException{
                
                // 1. n,m 입력
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());

                // 2. parent 배열 크기 선언
                // 2.1 parent 배열에 n의값 저장(for문)
                parent = new int[n+1];
                for(int i=0; i<n+1; i++){
                    parent[i] = i;
                }

                // 3. m의 값 입력(for문)
                for(int i=0; i<m; i++){
                    st = new StringTokenizer(br.readLine());
                    int discrimination = Integer.parseInt(st.nextToken());
                    int a = Integer.parseInt(st.nextToken());
                    int b = Integer.parseInt(st.nextToken());
                    
                    // 3.1 판별값이 0 인 경우(if) -> union
                    if(discrimination == 0){
                        union(a,b);
                    }
                    // 3.2 판별값이 1인 경우(else) -> isSameParent
                    else{
                        isSameParent(a,b);
                    }
                }
        }
        // 4. find 구현
        public static int find(int x) {
            if(x == parent[x])
                return x;
            else 
                return parent[x] = find(parent[x]);
        }

        // 5. union
        public static void union(int a, int b) {
            a = find(a);
            b = find(b);
            if(a != b) {
                parent[b] = a;
            }
        }

        // 6. isSameParent
        public static void isSameParent(int a, int b) {
            a = find(a);
            b = find(b);
            if(a == b) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }    
}