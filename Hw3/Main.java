package AISD.Hw.Hw3;
import org.w3c.dom.Node;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Tree root =
                new Tree(20,
                        new Tree(7,
                                new Tree(4,null, new Tree(6)),new Tree(9)),
                        new Tree(35,
                                new Tree(31,new Tree(28),null),
                                new Tree(40, new Tree(38), new Tree(52))));

        System.out.println("Sum of tree elements = " + summWide(root));
    }
    static class Tree{
        int value;
        Tree left;
        Tree right;

        public Tree(int value, Tree left, Tree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Tree(int value) {
            this.value = value;
        }
    }

    public static int summWide(Tree root){
        Queue<Tree> tQ = new LinkedList<>();
        tQ.add(root);

        int summa = 0;

        while(!tQ.isEmpty()){
            Tree node = tQ.remove();

            summa+= node.value;

            if (node.left != null){
                tQ.add(node.left);
            }

            if (node.right != null){
                tQ.add(node.right);
            }
        }

        return summa;
    }
}
