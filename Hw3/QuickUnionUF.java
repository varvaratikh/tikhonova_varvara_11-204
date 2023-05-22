package AISD;

import java.util.*;

public class QuickUnionUF {
    public static void main(String[] args) {
        QuickUnionUF neqGraf = new QuickUnionUF(5);
        neqGraf.union(2, 4);
        System.out.println(neqGraf.connected(2, 3));
    }
    private int[] id;

    // Set id of each object to itself
    public QuickUnionUF(int N) {
        id = new int[N];
        for(int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    private int root(int i) {
        while(i != id[i]) i = id[i];
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}