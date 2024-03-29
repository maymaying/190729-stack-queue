import java.util.LinkedList;

class MyStack {
    private LinkedList<Integer> queue;

    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.addLast(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int size = queue.size();
        for (int i = 0; i < size - 1; i++) {
            int v = queue.pollFirst();
            queue.addLast(v);
        }

        return queue.pollFirst();
    }

    /** Get the top element. */
    public int top() {
        int size = queue.size();
        for (int i = 0; i < size - 1; i++) {
            int v = queue.pollFirst();
            queue.addLast(v);
        }

        int v = queue.pollFirst();
        queue.addLast(v);
        return v;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}