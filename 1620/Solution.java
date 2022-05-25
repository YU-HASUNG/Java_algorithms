    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.HashMap;
    import java.util.StringTokenizer;

    public class Solution{
        public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            HashMap<String, Integer> map = new HashMap<>();
            String[] poke = new String[n];
            for(int i=0; i<n; i++){
                String sti = br.readLine();
                map.put(sti, i+1);
                poke[i] = sti;
            }

            for(int i=0; i<m; i++){
                String temp = br.readLine();

                if(!(Character.isDigit(temp.charAt(0)))){
                    System.out.println(map.get(temp));
                }
                else{
                    int num = Integer.parseInt(temp)-1;
                    System.out.println(poke[num]);
                }
            }
        }
    }