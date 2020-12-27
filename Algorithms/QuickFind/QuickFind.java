package Com.Algorithms.QuickFind;

public class QuickFind {

    private int[] id;
    private int count;

    public  QuickFind(int n){
        count = n;
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public int count(){
        return count;
    }

    public void union(int p, int q){
        if (!connected(p,q)) {
            for (int i = 0; i < id.length; i++) {
                if (id[i] == id[p]){
                    id[i] = id[q];
                }
            }
            count--;
        }

    }

    public boolean connected(int p, int q){
        return id[p] == id[q];
    }

}
