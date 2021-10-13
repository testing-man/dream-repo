package queue;

public class Client {

    public static void main(String[] args) {

        Queue queue = new Queue();

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);

        queue.display();

        System.out.println();

        System.out.println(queue.dequeue());

        queue.display();

    }

}
