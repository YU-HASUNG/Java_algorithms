import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution{
    static int n, m;
    static int[] arrN;
    public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
    // 1. N입력
    // 2. N개 숫자입력 및 저장 및 정렬
    n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    arrN = new int[n];
    for(int i=0; i<n; i++){
        arrN[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(arrN);

    // 3. M입력
    // 4. 이분탐색
    m = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    
    for(int i=0; i<m; i++){
        int num = Integer.parseInt(st.nextToken());
        if(binarySearch(num)) bw.write("1 ");
        else bw.write("0 ");
    }

    bw.flush();
    bw.close();
    br.close();
    }
    
    // 5. 이분탐색
    private static boolean binarySearch(int num){
        int leftIndex = 0;
        int rightIndex = n - 1;

        while( leftIndex <= rightIndex ){
            int midIndex = (leftIndex + rightIndex)/2;
            int mid = arrN[midIndex];

            if(num < mid){
                rightIndex = midIndex-1;
            }
            else if(num > mid){
                leftIndex = midIndex+1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}