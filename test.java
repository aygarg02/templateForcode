public class test {
    public static void main(String[] args) {
        int arr[]={2,3,10,6,5};
        SegmentTree s=new SegmentTree(arr.length, arr);
      
        System.out.println(  s.rangeQuery(3, 6));
    }
}
