import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {

    private Queue<Integer> mainQueue;
    private Queue<Integer> tempQueue;

    public StackUsingQueues() {
        mainQueue = new LinkedList<>();
        tempQueue = new LinkedList<>();
    }

    public void push(int value) {
        mainQueue.add(value);
    }

    public int pop() {
        if (mainQueue.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        // Move elements from mainQueue to tempQueue except the last element
        while (mainQueue.size() > 1) {
            tempQueue.add(mainQueue.remove());
        }

        // Pop the last element from mainQueue
        int poppedValue = mainQueue.remove();

        // Swap mainQueue and tempQueue
        Queue<Integer> temp = mainQueue;
        mainQueue = tempQueue;
        tempQueue = temp;

        return poppedValue;
    }

    public int top() {
        if (mainQueue.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        int topValue = 0;

        // Move elements from mainQueue to tempQueue except the last element
        while (!mainQueue.isEmpty()) {
            topValue = mainQueue.remove();
            tempQueue.add(topValue);
        }

        // Swap mainQueue and tempQueue
        Queue<Integer> temp = mainQueue;
        mainQueue = tempQueue;
        tempQueue = temp;

        return topValue;
    }

    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top: " + stack.top());  // Output: 3
        System.out.println("Pop: " + stack.pop());  // Output: 3
        System.out.println("Top: " + stack.top());  // Output: 2
    }
}
