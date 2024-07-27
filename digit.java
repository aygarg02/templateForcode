public class digit{
    static int[][][][][] dp=new int[20][2][2][180][20];
    public static void main(String[] args) {
        

    }
    int fxn(int i,int n,int tight,int nonZero,int sum,int digit,String sr){
      if(i==n){
        if(digit==1 && sum%digit==0 )return 1;
      }
      if(dp[i][n][nonZero][sum][digit]!=-1)return dp[i][n][nonZero][sum][digit];

    int ub=






    }
}