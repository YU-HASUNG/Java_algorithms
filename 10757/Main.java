import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        //StringTokenizer를 이용하여 A, B를 입력받는다.
        String A = (st.nextToken());
        String B = (st.nextToken());

        //max_length에 A,B 중 더 긴 값을 저장한다.
        int max_length = Math.max(A.length(), B.length());

        //최고자리수의 합이 10을 넘을 수 있기 때문에 +1로 여유공간을 만들어 배열을 선언해준다.
        int[] Aarr = new int[max_length+1];
        int[] Barr = new int[max_length+1];
        
        //Aarr 배열을 생성하여, A를 역순으로 저장한다
        for(int i = A.length()-1,idx=0; i>=0; i--,idx++){
            Aarr[idx] = A.charAt(i)-'0';
        }

        //Barr 배열을 생성하여, B를 역순으로 저장한다
        for(int i = B.length()-1,idx=0; i>=0; i--,idx++){
            Barr[idx] = B.charAt(i) - '0';
        }

        //Aarr배열을 중심으로 계산을 진행
        //Aarr과 Barr을 더하고
        //%10을 활용해
        //더한값이 10을 넘는 경우와 넘지 않는 경우를 한번에 처리해준다.
        //그리고 value/10을 해주어
        //더한값이 10을 넘는다면 다음 배열(i+1)에 저장해준다.
        for(int i = 0; i < max_length; i++) {
            int value = Aarr[i] + Barr[i];
            Aarr[i] = value%10;
            Aarr[i+1] += (value/10);
        }

        //StringBuilder의 append를 통해 문자열을 저장해서 출력해준다.
        StringBuilder sb = new StringBuilder();

        //만약 최댓값이 0이 아니라면,
        //즉, 최고자리수의 합이 10을 넘는다면 출력해준다.
        if(Aarr[max_length] != 0){
            sb.append(Aarr[max_length]);
        }
        //나머지를 차례대로 출력해준다.
        for(int i = max_length -1; i>=0; i--){
            sb.append(Aarr[i]);
        }
        System.out.println(sb);

    }
}