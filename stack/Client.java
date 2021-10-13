package stack;

public class Client {

    public static void main(String[] args) throws Exception {

        Stack stack = new Stack();

        System.out.println("isEmpty => " + stack.isEmpty());

        // System.out.println(stack.pop());

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(30);
        stack.push(30);

        System.out.println("isEmpty => " + stack.isEmpty());

        System.out.println("Size => " + stack.size());

        System.out.println("pop => " + stack.pop());

        System.out.println("peek => " + stack.peek());

        System.out.println("Size => " + stack.size());

        stack.display();

    }

}