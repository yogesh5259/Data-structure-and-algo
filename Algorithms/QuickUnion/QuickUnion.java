package Com.Algorithms.QuickUnion;

public class QuickUnion {

    private int[] id;
    private int count;

    public QuickUnion(int n){
        count = n;
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
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
        int i = root(p);
        int j = root(q);

        id[i] = j;
        count--;
    }

}
