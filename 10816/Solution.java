import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;


// HashMap 활용풀이

public class Solution{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer, Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<N; i++){
            int key = Integer.parseInt(st.nextToken());

            map.put(key,map.getOrDefault(key, 0)+1);
            //map에 입력되는 킷값의 개수를 저장
            //-> default 는 1 저장
            //이후 동일한 킷값이 호출된면 1씩 더해짐
        }

        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0;i<M;i++){
            int key = Integer.parseInt(st.nextToken());

            sb.append(map.getOrDefault(key, 0)).append(' ');
        }
        System.out.println(sb);

    }
}