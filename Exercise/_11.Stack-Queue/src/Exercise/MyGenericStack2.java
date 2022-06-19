package Exercise;

import java.util.ArrayList;
import java.util.Collections;


public class MyGenericStack2<E> {
    private ArrayList<E> stack;

    public  MyGenericStack2(){stack=new ArrayList<E>();}

    public boolean isEmpty(){
        if(stack.size()==0){
            return true;
        }
        return  false;
    }
    public void push (E e){stack.add(e);}


    public E pop(){
        return stack.remove(stack.size()-1);
    }
    public void reverse(){
        for (int i = 0,j= stack.size()-1; i < stack.size()/2; i++,j--) {
            E temp = stack.get(i);
            stack.set(i, stack.get(j));
            stack.set(j,temp);
        }
    }
    public ArrayList<String> split(String string){
        String[] temp=string .split(" ");

        ArrayList<String> tempStack= (ArrayList<String>)stack;
        Collections.addAll(tempStack,temp);
       return tempStack;

        



    }

    @Override
    public String toString() {
        return "MyGenericStack2{" +
                "stack=" + stack +
                '}';
    }
}
