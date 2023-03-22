package AISD;

public class Queue {
    private Stack first;
    private Stack last;

    public Queue(Stack first, Stack last) {
        this.first = first;
        this.last = last;
    }

    public boolean add(int i){
        first.add(i);
        return true;
    }

    public int getElem(){
        if(last.isEmpty()) {
            while (!first.isEmpty()) {
                last.add(first.getFirst());
            }
        }
        return last.getFirst();
    }
    public boolean isEmpty(){
        return (first.isEmpty() && last.isEmpty());
    }

    @Override
    public String toString() {
        return "$classname{" +
                "first=" + first +
                ", last=" + last +
                '}';
    }
}

class MyStack {
    private int[] arr = new int[10000];
    private int current = 0;

    public MyStack(){

    }

    public MyStack(int size){
        arr = new int[size];
        current = -1;
    }

    public void add(int elem){
        current++;
        arr[current] = elem;
    }

    public int getFirst(){
        if (current != -1){
            int a = arr[current];
            current--;
            return a;
        }
        return -1;
    }

    public int seeFirst(){
        return arr[current];
    }

    public boolean isEmpty(){
        return (current == -1);
    }
}
