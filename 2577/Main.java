    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class Main{
        public static void main(String[] args)throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int A = Integer.parseInt(br.readLine());
            int B = Integer.parseInt(br.readLine());
            int C = Integer.parseInt(br.readLine());
            br.close();

            int sum = A*B*C;

            String Ssum = Integer.toString(sum);
            
            String[] array = Ssum.split("");
            int[] numArray = new int[10];

            for(int i=0;i<Ssum.length();i++){
                
                for(int j=0;j<10;j++){
                    if(array[i].equals(Integer.toString(j))){
                        numArray[j] = numArray[j] + 1;
                    }   
                }
            }

            for(int i=0;i<10;i++){
                System.out.println(numArray[i]);
            }
        }
    }