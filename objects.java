import java.util.*;

class Emp
{
    public int id;
    public String name;
    void display()
    {
        System.out.println("Id:"+id+"\nName:"+name);
    }
}

public class objects {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Emp e[]=new Emp[n];
        for(int i=1;i<=n;i++)
        {
            e[i-1]=new Emp();
            e[i-1].id=sc.nextInt();
            e[i-1].name=sc.next();

        }
        for(int j=1;j<=n;j++)
        {
            e[j-1].display();
        }

        sc.close();
    }
    
}
