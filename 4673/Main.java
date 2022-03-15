public class Main{
    //메인 함수
    public static void main(String[] args){
        
        boolean[] check = new boolean[10001];
        
        for(int i=0;i<10001;i++){ //1~10000의 수를 한번씩 호출
            int n = d(i); //d(int number)함수를 통해 sum값(Self Number)을 받아옴

            if(n<10001){ //1~10000범위 사이의 Slef Number을 check[] boolean 배열에 true로 담음
                check[n] = true;
            }
        }

        for(int i=0;i<10001;i++){
            if(!check[i]){  //1~10000 중 check 배열에 없으면 출력해줌 
            System.out.println(i);
            }
        }

        
    }

    //함수 선언
    public static int d(int number){
        int sum = number; //메인 함수에서 받아온 수를 sum에 저장 

        while(number != 0){ //number이 0이 될때까지...
            sum = sum + (number%10); //%10으로 1일자리수 구해서 기존의 sum에 더해줌
            number = number/10; //나눗셈으로 1일자리수 삭제
        }
        return sum;
    }
}