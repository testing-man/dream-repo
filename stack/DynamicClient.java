package stack;

public class DynamicClient {

    public static void main(String[] args) throws Exception {

        DynamicStack stack = new DynamicStack();

        System.out.println("isEmpty => " + stack.isEmpty());

        // System.out.println(stack.pop());

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("isEmpty => " + stack.isEmpty());

        System.out.println("Size => " + stack.size());

        System.out.println("pop => " + stack.pop());

        System.out.println("peek => " + stack.peek());

        System.out.println("Size => " + stack.size());

        stack.display();

    }

}
