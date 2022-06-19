package Exercise;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<E> {
    private LinkedList<E> stack;

    public  MyGenericStack(){
        stack =new LinkedList<E>();
    }

    public  boolean isEmpty(){
        if(stack.size()==0){
            return true;
        }
        return false;
    }


    public void push(E e) {
        stack.addLast(e);
    }
    public E pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return  stack.removeFirst();
    }
    public  void reverse(){
        for (int i = 0; i < stack.size()/2 ; i++) {
            stack.addLast(stack.getFirst());
            stack.removeFirst();
        }

    }

    public int size(){
        return stack.size();
    }

    public void split(String e ){
        e.split(e);
    }
    @Override
    public String toString() {
        return "MyGenericStack{" +
                "stack=" + stack +
                '}';
    }
}
