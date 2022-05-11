import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list= new ArrayList<>();
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list);

        for(int value : list){
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}