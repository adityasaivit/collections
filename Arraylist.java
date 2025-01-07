import java.util.*;
public class Arraylist {
    public static void main(String args[])
    {
        ArrayList<Integer> a=new ArrayList<Integer>();
        // Arraylist methods

        for(int i=1;i<=10;i++){
            a.add(i);
        }

        System.out.println(a);

        // to remove the elements
        for(int j=1;j<=10;j++)
        {
            a.remove(0);
        }
        System.out.println(a);
        for(int i=1;i<=10;i++){
            a.add(i);
        }
        // to set the elements

        a.set(9,99);
        System.out.println(a);

        // to get the elements

        System.out.println("the elemet in the index 9  "+a.get(9));

        // size of the element is

        System.out.println("The size of the element is "+a.size());
        
        a.add(99);
        // to sarch the element 

        System.out.println("the element is at the position "+a.indexOf(99));
        System.out.println("the element is at the last position"+a.lastIndexOf(99));

        // to convert to the array

        Object[] arr=a.toArray();
        System.out.println(arr[0]);

        // to clear all the elements 
        System.out.println(a);
        // to display()
        System.out.println("to display:");

        Iterator<Integer> i=a.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        a.clear();
        System.out.println(a);


    }
    
}
