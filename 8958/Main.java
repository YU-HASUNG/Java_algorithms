import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String array[] = new String[N];

        int discrimination = 0; //자릿값이 O인 경우에 값을 증가시킨다.
        int sum[] = new int[N]; //합

        for(int i=0;i<N;i++){ //처음 N의 개수만큼 반복한다.
            array[i] = br.readLine(); //다음줄을 읽어온다.
                for(int j=0;j<array[i].length();j++){ //읽어온 줄의 길이만큼 반복한다.
                    if(array[i].charAt(j) == 'O'){ //배열의 j번째값이 'O' 이라면...
                            ++discrimination; //discrimination 값을 증가시킨다.
                            sum[i] = sum[i]+discrimination; //기존의 sum의 값에 추가로 discrimination값을 더해준다
                    }
                    else{
                        discrimination = 0; //만약 값이 X라면 discrimination의 값을 0으로 초기화한다.
                    }
                }
            discrimination =0; //한줄의 반복이 끝나면 다음줄을 위해 discrimination의 값을 0으로 초기화시킨다.
        }
        br.close();

        for(int i=0;i<N;i++){
            System.out.println(sum[i]);
        }

        

    }
}