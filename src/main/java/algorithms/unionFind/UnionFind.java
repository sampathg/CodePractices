package algorithms.unionFind;

public interface  UnionFind {

    public boolean connected(int p , int q);
    public void union(int p , int q);
    public int root(int p);
}
