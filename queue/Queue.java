package queue;

public class Queue {

    int[] queue = new int[5];
    int size = 0, front = 0, rear = 0;

    public void enQueue(int data) {

        queue[rear] = data;
        rear++;
        size++;

    }

    public int dequeue() {
        int data = queue[front];
        front++;
        size--;
        return data;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(queue[front + i] + " ");
        }
    }

}
