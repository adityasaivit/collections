import java.util.*;
public class stacks {
    public static void main(String args[])
    {
        // stacks were implemented in the collections
        Stack<Integer> s=new Stack<>();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("1.push\n2.pop\n3.search\n4.peek\n5.display\n6.break");
            System.out.println("Enter your choice:");
            int i=sc.nextInt();
            if(i==6)
            {
                break;
            }
            switch(i)
            {
                case 1:
                    System.out.println("Enter the integer:");
                    int n=sc.nextInt();
                    s.push(n);
                    break;
                case 2:
                    int n1=s.pop();
                    System.out.println("The popped element is "+n1);
                    System.out.println("the current state is :"+s);
                    break;
                case 3:
                    System.out.println("Enter the element to search:");
                    int n2=sc.nextInt();
                    int p=s.search(n2);
                    if(p==-1){
                        System.out.println("Not found in the stack");
                    }
                    else{
                        System.out.println("it was found at the position :"+p);
                    }
                    break;
                case 4:
                    System.out.println("The top of the stack is "+s.peek());
                    break;
                case 5:
                    System.out.println("Dispaly of the stack is "+s);
                    break;
                default:
                    System.out.println("Not a valid option");

            }
        }
        sc.close();
    }
    
}
