import java.util.Arrays;

public class Stack {
    private int[] array;
    private int top;

    public Stack(int defaultCapacity) {
        array = new int[defaultCapacity];//默认值
        top = 0;
    }

    public Stack() {
        this(20);
    }

    //插入
    public void push(int val) {
        //扩容
        if (top == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[top++] = val;
    }

    //删除
    public void pop() {
        if (top <= 0) {
            System.out.println("栈为空，无法删除");
            return;
        }

        top--;
        array[top] = 0;	// 可加可不加，把所有空的位置保持为 0
    }

    //返回当前的栈顶元素
    public int top() {
        if (top <= 0) {
            System.out.println("栈为空，无法返回栈顶元素");
            return -1;
        }

        return array[top - 1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }
}
