public class Stack {
    int size;
    int array[];
    int top;

    public Stack(int size) {
        this.size=size;
        this.array = new int[size];
        this.top = -1;
    }

    public static void main(String args[]) {
        Stack stack = new Stack(3);
        stack.push(1);
        stack.push(2);
        if(!stack.isStackEmpty())stack.pop();
        if(!stack.isStackEmpty())stack.pop();
        if(!stack.isStackEmpty())stack.pop();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        if(!stack.isStackEmpty())stack.pop();
        stack.display();
    }

    private void push(int value) {
        if(isStackFull())
            System.out.println("Stack Overflow,Cannot add more elements");
        else {
            top++;
            array[top] = value;
        }
    }

    private void display() {
       if(isStackEmpty())
            System.out.println("Stack is Empty");
        else if (isStackFull())
            System.out.println("Stack Overflow");
        else
            for (int i = 0; i <= top; i++) System.out.println(array[i]);
    }

    private int pop() {
        if(isStackEmpty())
            return 0;
        else {
            int value = array[top];
            top--;
            return value;
        }
    }

    private boolean isStackEmpty() {
        return top == -1;
    }

    private boolean isStackFull() {
        return array.length - 1 == top;
    }
}
