import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
    	
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		//라인단위로 입력받는 BufferReader 객체 생성 
		
		int N = Integer.parseInt(bufferedReader.readLine());
		//입력받을 줄의 개수 입력받기
		
		StringTokenizer st = null;
		//라인 입력시 공란을 파싱하기 위한 StringTokenizer 선언
		
		int[] array = new int[N];
		//StringTokenizer을 활용해 파싱된 Token을 저장하기 위한 배열
		int[] sum = new int[N];
		//파싱된 Token끼리의 합의 저장하기 위한 배열
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(bufferedReader.readLine());
			//i<N일 동안 입력받아라
			for(int j=0;j<2;j++) {
				array[j] = Integer.parseInt(st.nextToken());
				//Token 저장하여라
			}
			
			int A = array[0];
			int B = array[1];
			sum[i] = A + B;
			//Token끼리 더하여라
			
		}
		bufferedReader.close();
		//reader 스트림 종료
		
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int k=0;k<N;k++) {
			bufferedWriter.write(sum[k]+"\n");
			// bufferedWriter 는 System.out.println 처럼 자동 개행 처리가 되지 않기 때문에 개행 처리를 따로 해줘야한다.
	        // bufferedWriter.newLine(); 을 활용하면 개행처리가 가능하나 이건 "\n"에 비해 속도가 느리다고 하니
	        // "\n" 을 활용해 개행처리를 하는 걸 권장한다. 또한 여기엔 하나의 장점이 더 있는데
	        // bufferedWriter.write(i); 처럼 writer에 int를 넣으면 아스키 코드에 따른 char형 값이 출력된다.
	        // 그러나 i와 개행 처리 문자열 "\n" 을 더하면 String 으로 자동 형변환 되기 때문에 
	        // 저장되어 있는 int 값 그대로 출력이 가능하다. 여러모로 이 편이 좋다는 얘기
			//주석 출처(https://takeknowledge.tistory.com/44)
		}
		bufferedWriter.flush(); // 다 사용했으면 남아있는 데이터를 모두 출력시키고
		bufferedWriter.close(); // writer스트림 종료
    }
}