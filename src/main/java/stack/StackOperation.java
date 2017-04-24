package stack;

import java.util.Arrays;

public class StackOperation {
	Object[] stack;
	int size;
	   final Object[] EMPTYELEMENTDATA = {};
	  final int DEFAULT_CAPACITY = 10;
	  final static int ARRAY_SIZE = Integer.MAX_VALUE - 8;
	 public StackOperation()
	 {
		 this.stack=EMPTYELEMENTDATA;
	 }
	public void certainCapacityInternal(int minCapacity) {
        if (stack== EMPTYELEMENTDATA) {
            minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
        }

        certainExternalCapacity(minCapacity);
	}
    	public void certainExternalCapacity(int minCapacity) {
    	       

            
            if (minCapacity - stack.length > 0)
                grow(minCapacity);
        }
    	  public void grow(int minCapacity) {
    	        // overflow-conscious code
    	        int oldCapacity = stack.length;
    	        int newCapacity = oldCapacity + (oldCapacity >> 1);
    	        if (newCapacity - minCapacity < 0)
    	            newCapacity = minCapacity;
    	        if (newCapacity - ARRAY_SIZE > 0)
    	            newCapacity = hugeCapacity(minCapacity);
    	        // minCapacity is usually close to size, so this is a win:
    	        stack = Arrays.copyOf(stack, newCapacity);
    	    }
    	  public static int hugeCapacity(int minCapacity) {
    	        if (minCapacity < 0) // overflow
    	            throw new OutOfMemoryError();
    	        return (minCapacity > ARRAY_SIZE) ?
    	            Integer.MAX_VALUE :
    	            ARRAY_SIZE;
    	    }
        
	public boolean push(Object element)
	{
		addElement(element);
		return true;
		
	}
	public  void addElement(Object element) {
       
       
		certainCapacityInternal(size + 1);
        stack[size++] = element;
    }
	public boolean pop(int index)
	{
		deleteElement(size-1);
		return true;
		
	}
	public void deleteElement(int index) {
		if(index>size||index<0)
		{
			throw new ArrayIndexOutOfBoundsException(index);
		}
		else
		{
			  int j = size - index - 1;
		        if (j > 0) {
		            System.arraycopy(stack, index + 1, stack, index, j);
		            //arraycopy(src,srcposition,destination,destination position)
		        }
		        size--;
		        //stack[size] = null;
		}
	}
	public int Size()
	{
		if (size < stack.length) {
	         stack = (size == 0)
	           ? EMPTYELEMENTDATA
	           : Arrays.copyOf(stack, size);
		}
		return stack.length;
	}
	public boolean isEmpty()
	{
		return stack.length==0;
		
	}
	public static void main(String[] args) {
		
	}
}


