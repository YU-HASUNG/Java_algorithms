import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1,x2,y1,y2,r1,r2;

            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            r1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            r2 = Integer.parseInt(st.nextToken());

            int xRange = Math.abs(x1-x2);
            int yRange = Math.abs(y1-y2); 
            int rPlus = r1+r2;
            int rMinus = Math.abs(r1-r2);

            int xrPow = xRange*xRange;
            int yrPow = yRange*yRange;
            int xyRange = xrPow + yrPow;

            //중점이 같을 경우
            if(x1 == x2 && y1 == y2){
                //반지름도 같을 경우
                if(r1 == r2){
                    bw.write("-1\n");
                }
                //반지름이 다를 경우
                else{
                    bw.write("0\n");
                }
            }
            //점간의 길이가 길이의 합보다 길때 or 점간의 길이가 길이의 합보다 작을때
            else if(xyRange > rPlus*rPlus || xyRange < rMinus*rMinus){
                bw.write("0\n");
            }
            //같을때
            else if(xrPow+yrPow == rPlus*rPlus ||xrPow+yrPow == rMinus*rMinus){
                bw.write("1\n");
            }
            else{
                bw.write("2\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}