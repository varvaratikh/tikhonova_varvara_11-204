package AISD.Hw.Hw2;
import java.util.*;

public class QuickFindUF {
    public static void main(String[] args) {
        QuickFindUF neqGraf = new QuickFindUF(5);
        neqGraf.union(2, 4);
        System.out.println(neqGraf.connected(2, 3));
        System.out.println(neqGraf.toString());
    }
    private int[] id;

    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++){
            id[i] = i;
        }
    }

    public String connected(int p, int q) {
        if(id[p] == id[q]){
            return "("+p+","+q+")";
        }
        return null;
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++){
            if (id[i] == pid){
                id[i] = qid;
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(id);
    }
}