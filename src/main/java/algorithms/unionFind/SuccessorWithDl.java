package algorithms.unionFind;

/*
Hint: use the modification of the union−find data discussed in the previous question.
*/
public class SuccessorWithDl {
    int[] objects;

    public SuccessorWithDl( int size){
        objects = new int[size];
        for(int i=0 ; i < size ;i++){
            objects[i] = i;
        }
    }

    public void remove(int i){
        objects [i] =0;
    }

    public int findSuccessor(int y){
        if(objects[y] !=0)
            return  objects[y+1];
        return y ;
    }
}
