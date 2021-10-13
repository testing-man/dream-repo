package stack;

public class Stack {

    int[] arr = new int[5];
    int top = -1;

    public void push(int data) throws Exception {
        if (top == arr.length - 1) {
            throw new Exception("Stack is full");
        }
        top++;
        arr[top] = data;
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
