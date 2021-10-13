package stack;

public class DynamicStack {

    int capacity = 2;

    int[] arr = new int[capacity];
    int top = -1;

    public void push(int data) throws Exception {

        if (size() == capacity) {
            expandArray();
        }

        top++;
        arr[top] = data;
    }

    private void expandArray() {
        int length = size();
        int[] newStack = new int[capacity * 2];
        System.arraycopy(arr, 0, newStack, 0, length);
        arr = newStack;
        capacity *= 2;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Empty");
        }
        int data = arr[top];
        arr[top] = 0;
        top--;
        return data;
    }

    public int peek() {
        return arr[top];
    }

    public int size() {
        return top + 1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

}
