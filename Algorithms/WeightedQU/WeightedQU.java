package Com.Algorithms.WeightedQU;

@SuppressWarnings("All")
public class WeightedQU {

    private int[] id;
    private int[] sz;
    private int count;

    public WeightedQU(int n){
        count = n;
        id = new int[n];
        sz = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    public int getCount(){
        return count;
    }

    private int root(int i){
        while (i != id[i]) i = id[i];
        return i;
    }

    public boolean connected(int p, int q){
        return root(p) == root(q);
    }

    public void union(int p, int q){
        if (!connected(p,q)){
            int i = root(p);
            int j = root(q);
            if(sz[i] > sz[j]){
                id[j] = i;
                sz[i] += sz[j];
            } else {
                id[i] = j;
                sz[j] += sz[i];
            }
            count--;

        }
    }

}
