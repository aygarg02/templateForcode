public class SegmentTree {
    int seg[];
    int n;
    int arr[];
    SegmentTree(int n,int arr[]){
    this.n=n;
    seg=new int[4*n];
    this.arr=arr;
    segmentCre(0, n-1, 0);
    }
  

   private int segmentCre(int low,int high,int index){
        if(low==high){
            seg[index]=arr[low];
            return seg[index] ;
        }
        int mid=(low+high)/2;
        int left=segmentCre(low, mid, 2*index+1);
        int right=segmentCre(mid+1, high, 2*index+2);
        seg[index]=left+right;
        return seg[index];
    }

    private int minRange(int l,int r,int sl,int sr,int index){
        
        if(sr<l || r<sl){
            return Integer.MAX_VALUE;
        }//no overlap
        if (l <= sl && sr <= r) {
            // System.out.println(l+" "+r+" "+seg[index]+" "+index);
            return seg[index]; // Complete overlap
        }

        else {
            int mid=(sl+sr)/2;
            int right=Integer.MAX_VALUE;
            int left=Integer.MAX_VALUE;
            // System.out.println(mid);
            right=minRange(l, r, sl, mid, 2*index+1);
            left=minRange(l, r, mid+1, sr, 2*index+2);
            return Math.min(right,left);
        }

    }
    int rangeQuery(int l,int r){
        return minRange(l,r,0,n-1,0);
    }



    



    
}
