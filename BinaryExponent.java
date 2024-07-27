public class BinaryExponent {
static final int mod =(int )(1e9+7);
    public long power(long x, long y){
        if(y==0)return 1;
        long p=power(x, y/2)%mod;
        p=(p*p)%mod;
        return (y%2==0)?p:(x*p)%mod;
    }
    long modInverse(long A){

        return (power(A,mod-2));
    }
    long fac(long n){
        long x=1;
        for(int i=1;i<=n;i++){
            x*=i;
            x%=mod;
        }
        return x;
    }
    long nCr(long n,long r){
        long x=fac(n-r);
        x=modInverse(x);
        n=fac(n);
        r=fac(r);
        r=modInverse(x);
        long ans=(n*r)%mod;
        ans*=x;
        ans%=mod;
        return ans;

    }

}