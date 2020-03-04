package custom;

import java.util.Arrays;

public class DataList<E> 
{
   
    private int size = 0;
     
   
    private static final int DEFAULT_CAPACITY = 10;
     
   
    private Object elements[];
 
   
    public DataList() {
        elements = new Object[DEFAULT_CAPACITY];
        elements[size++]="1";
        elements[size++]="2";
        elements[size++]="3";
        elements[size++]="4";
        elements[size++]="5";
        elements[size++]="6";
        elements[size++]="7";
        elements[size++]="8";
        elements[size++]="9";
        elements[size++]="10";
        
    }
 
   
    public void add(E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }
     
   
    
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }
     
   
   
    public E remove(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        Object item = elements[i];
        int numElts = elements.length - ( i + 1 ) ;
        System.arraycopy( elements, i + 1, elements, i, numElts ) ;
        size--;
        return (E) item;
    }
    
    
     
   
   
   
    public String toString() 
    {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i = 0; i < size ;i++) {
             sb.append(elements[i].toString());
             if(i<size-1){
                 sb.append(",");
             }
         }
         sb.append(']');
         return sb.toString();
    }
     
    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
}