import java.util.*;
public class Linkedlist {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> l=new LinkedList<>();

        // addition of the element in the linkedlist
        l.addFirst(1);
        l.addLast(2);
        l.addFirst(3);
        l.addLast(4);
        System.out.println(l);
        sc.close();
        l.add(0,5);
        l.addLast(6);
        l.addLast(7);
        l.addLast(8);
        l.addLast(9);

        System.out.println(l);

        // retriving the elements first element
        System.out.println("the First element in the list is "+l.getFirst());
        // retriving the element last element
        System.out.println("the last element in the list is "+l.getLast());

        // conversion of the elements/linkedlist to the array

        Object[] arr=l.toArray();
        System.out.println(arr);
        System.out.println("the Array form of the linkedlist is ");
        for(int i=1;i<=arr.length;i++)
        {
            System.out.println(arr[i-1]);
        }

        // settig of the element

        l.set(2,99);
        System.out.println("the element at index 2 was changed to "+l);
        // get the elment by the index
        System.out.println("the retrived is "+l.get(2));

        // search of the element

        l.addLast(9);
        System.out.println("the first index of the element is "+l.indexOf(9));

        // search of the element

        // the last index of a [articular element]

        System.out.println("the last index of the element is "+l.lastIndexOf(9));

        // remove elements
        // remove first
        System.out.println(l);
        l.removeFirst();
        System.out.println(l);

        // remove from the last

        l.removeLast();
        System.out.println(l);

        // to clear at a particular position
        l.remove(1);
        System.out.println(l);
        // to clear all the elements

        l.clear();
        System.out.println(l);

    }
    
}
