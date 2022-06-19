package Exercise;

import java.util.Arrays;
import  java.util.ArrayList;
import java.util.LinkedList;

public class MyList<E> {
    private int size=0;
    private  static final int DEFAULT_CAPACITY=10;
    private  Object elements[];


    public  MyList(){
        elements=new Object[DEFAULT_CAPACITY];
    }

    private  void  ensureCapa(){
        int newSize= elements.length*2;
        elements= Arrays.copyOf(elements,newSize);
    }
    public void  add(E e){
        if(size == elements.length){
            ensureCapa();
        }
        elements[size++]=e;
    }
    public E get (int index){
        if(index>=size||index<0){
            throw new IndexOutOfBoundsException("Index:"+index+",Size:"+index);

        }
        return (E) elements[index];
    }
    public  E remove(int index){
        E oldValue=(E) elements[index];
        int numMoved=size-index-1;
        if(numMoved>0){
            System.arraycopy(elements,index+1,elements,index,numMoved);

        }
        elements[size--]=null;
        return oldValue;
    }
    public  int size(){
        return size;
    }
    public E clone(){
        Object[] arrCopy;
        arrCopy=Arrays.copyOf(elements,size);
        return (E) arrCopy;
    }
    public  int indexOf(E o){
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (elements[i]==null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (o.equals(elements[i]))
                    return i;
        }
        return -1;
    }
    public boolean contains (E o ){return indexOf(o)>=0;}

    public void clear(){
        for (int i = 0; i < size; i++) {
            elements[i]=null;
        }
        size=0;
    }


}
