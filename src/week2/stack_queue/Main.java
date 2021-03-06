package week2.stack_queue;


public class Main {

    public static void main(String[] args) {
        /**
         * for stack testing
         *
        StackOfString stack = new StackOfString();
        stack.push("test");
        stack.push("my");
        stack.push("ability");
        stack.push("ability");
        stack.push("ability");
        stack.push("ability");
        stack.push("ability");
        stack.push("ability");
        stack.pop();
        stack.pop();
        System.out.println(stack.size());*/

        /**
         * for resizing array implementation
         *
        ResizingArrayStackOfString arr = new ResizingArrayStackOfString();
        arr.push("hello");
        arr.push("here");
        arr.push("here is ");
        System.out.println(arr.size());
         */

        /**
         * for Queue
         *
        QueueOfString queue = new QueueOfString();
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        queue.enqueue("4");
        System.out.println(queue.dequeue());
         */

        /**
         *
         * for generic stack
        GenericStack<String> stack = new GenericStack<>();
        stack.push("1");
        stack.push("2");
        System.out.println(stack.pop());
         */
//
        StackIterator<String> stackIterator = new StackIterator<>();
        stackIterator.push("1");
        stackIterator.push("2");
        Iterator<String> iterator = stackIterator.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
