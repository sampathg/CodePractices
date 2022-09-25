package algorithms.unionFind;

import lombok.Data;

@Data
/*
Hint: maintain an extra array to the weighted quick-union data structure that stores
for each root  the large element in the connected component containing .
 */
public class UnionFindWeightedwithLargestID implements UnionFind{
    int[] objects;
    int[] sz;

    UnionFindWeightedwithLargestID(int sizeOfObjects){
        objects = new int[sizeOfObjects];
        sz = new int[sizeOfObjects];
        for(int i=0 ; i< sizeOfObjects ;i++) {
            objects[i] = i;
            sz[i] = 0;
        }
    }


    @Override
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    @Override
    public void union(int p, int q) {
        if(root(p)>=root(q))
            objects[q] = root(p);
        else
            objects[p] = root(q);
    }

    @Override
    public int root(int i) {

        while (i != objects[i]){
            objects[i] = objects[objects[i]];
            i = objects[i];
        }
        return i;
    }

    public int Find(int p){
        return root(p);
    }
}
