import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
public class Temp{
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
		private final BufferedWriter bw;

		public FastWriter() {
			this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		public void print(Object object) throws IOException {
			bw.append("" + object);
		}

		public void println(Object object) throws IOException {
			print(object);
			bw.append("\n");
		}

		public void close() throws IOException {
			bw.close();
		}
	}
    public static void main(String[] args) {
        try {
            FastReader in=new FastReader();
            FastWriter out = new FastWriter();
            int testCases=in.nextInt();
            String name=in.nextLine();
            while(testCases-- > 0){
               int arr[]=new int[3];
               arr[0]=in.nextInt();
               arr[1]=in.nextInt();
               arr[2]=in.nextInt();
               int dp[][][][]=new int[16][16][16][6];
               for(int[][][] a:dp){
                for(int temp[][]:a){
                    for(int[] b:temp)
                    Arrays.fill(b, -1);
                }
               }
               out.println(rec(arr,5,dp));
               
               
               
               
            
               
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
   static int rec(int arr[],int a,int dp[][][][]){
        if(a==0){
            return arr[0]*arr[1]*arr[2];
        }
        if(dp[arr[0]][arr[1]][arr[2]][a]!=-1)return dp[arr[0]][arr[1]][arr[2]][a];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<3;i++){
            arr[i]++;
            max=Math.max(max,rec(arr,a-1,dp));
            arr[i]--;
        }
        return dp[arr[0]][arr[1]][arr[2]][a]=max;
        
    }
}