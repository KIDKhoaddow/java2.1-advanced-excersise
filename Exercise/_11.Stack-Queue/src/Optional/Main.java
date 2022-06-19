package Optional;

import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        MyQueue queue = new MyQueue(4);
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(56);
        queue.enqueue(2);
        queue.enqueue(67);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(24);
        queue.dequeue();
        queue.enqueue(98);
        queue.enqueue(45);
        queue.enqueue(23);
        queue.enqueue(435);
        MyStack stack = new MyStack(5);

        stack.push(5);
        stack.push(4);
        stack.push(3);


        MyStack myStack;
        myStack = convertToBinary(253);
        System.out.println(myStack);

        isPalindromeString("able was I ere I saw elba");

        Stack<Character> stack1 = new Stack<Character>();
        char s[] = {'[','(',')',']','}','{','[','(',')','(',')',']','(',')','}'};

        if(isBalanced(s)){
            System.out.println("Expression is balanced.");
        }

        else{
            System.out.println("Expression is not balanced.");
        }
    }

    public static MyStack convertToBinary(int number) {
        int result = number;
        MyStack myStackBinary = new MyStack(number / 2);
        while (result >= 1) {
            if (result == 1) {
                myStackBinary.push(1);
            } else {
                myStackBinary.push(result % 2);
            }
            result = result / 2;
        }

        return myStackBinary;
    }

    public static boolean isPalindromeString(String string) {
        Stack<Character> myStack = new Stack<Character>();

        for (int i = 0; i < string.length(); i++) {

            myStack.push(string.charAt(i));
        }
        String reverseString = "";
        for (int i = 0; i < string.length(); i++) {
            reverseString += myStack.pop();
        }
        if (reverseString.equals(string)) {
            System.out.println("day la chuoi doi xung");
            return true;
        }
        System.out.println("day khong la chuoi doi xung");
        return false;

    }


    static boolean isPair(char character1, char character2) {
        if (character1 == '(' && character2 == ')')
            return true;

        else if (character1 == '{' && character2 == '}')
            return true;

        else if (character1 == '[' && character2 == ']')
            return true;

        else
            return false;
    }

    static boolean isBalanced(char s[]) {
        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < s.length; i++) {

            if (s[i] == '{' || s[i] == '(' || s[i] == '[')
                st.push(s[i]);

            if (s[i] == '}' || s[i] == ')' || s[i] == ']') {

                if (st.isEmpty()) {
                    return false;
                } else if (!isPair(st.pop(), s[i])) {
                    return false;
                }
            }

        }
        if(st.isEmpty())
            return true;

        else
            return false;
    }
}


