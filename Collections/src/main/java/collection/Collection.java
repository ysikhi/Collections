package collection;
import java.util.*;
public class Collection<C> 
{
	    private int n = 0,i;
	    private static final int DEFAULT = 10;
	    private Object a[];
	    public Collection() 
	    {
	        a = new Object[DEFAULT];
	        for(i=0;i<10;i++)
	        {
	        	a[n++] = i+1;
	        }
	    }
	    public void add(C e) 
	    {
	        if (n == a.length) 
	        {
	            ensureCapacity();
	        }
	        a[n++] = e;
	    }
	    public C  fetch(int i) 
	    {
	        if (i >= n || i < 0) 
	        {
	            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
	        }
	        return (C) a[i];
	    }
	    public C remove(int i) 
	    {
	        if (i >= n || i < 0) 
	        {
	            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
	        }
	        Object item = a[i];
	        int numElts = a.length - ( i + 1 ) ;
	        System.arraycopy( a, i + 1, a, i, numElts ) ;
	        n--;
	        return (C) item;
	    }
	    
	    public int size() 
	    {
	        return n;
	    }
	    public String toString() 
	    {
	         StringBuilder sb = new StringBuilder();
	         for(int i = 0; i < n ;i++) {
	             sb.append(a[i].toString());
	             if(i<n-1){
	                 sb.append(" ");
	             }
	         }
	         return sb.toString();
	    }
	     
	    private void ensureCapacity() 
	    {
	        int newSize = a.length * 2;
	        a = Arrays.copyOf(a, newSize);
	    }
	

}
