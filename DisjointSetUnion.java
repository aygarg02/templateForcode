public class DisjointSetUnion {
int parent[];
int rank[];
DisjointSetUnion(int N){
    parent=new int[N];
    rank=new int[N];
    for(int i=0;i<N;i++)parent[i]=i;
}

int findUpar(int x){
    if(parent[x]==x)return x;
    return parent[x]=findUpar(parent[x]);
}

    void UnionByRank(int x,int y){
        int ulp_X=findUpar(x);
        int ulp_y=findUpar(y);
        if(ulp_X==ulp_y)return ;
        if(rank[ulp_X]<rank[ulp_y] ){
            parent[ulp_X]=ulp_y;
        }
       else if(rank[ulp_X]>rank[ulp_y] ){
            parent[ulp_y]=ulp_X;
        }
        else{
            parent[ulp_y]=ulp_X;
            rank[ulp_X]++;
        }




    }
}