import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        
        String num;
        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> hs = new HashSet<>();
        ArrayList<String> al = new ArrayList<>();

        for(int i=0; i<N; i++){
            hs.add(br.readLine());
        }
        for(int i=0; i<M; i++){
            num = br.readLine();
            if(hs.contains(num)) {
                al.add(num);
                cnt++;
            }
        }

        Collections.sort(al);
        System.out.println(cnt);
        for(int i=0; i<al.size(); i++){
            bw.write(al.get(i)+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}