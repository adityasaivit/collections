class mystack
{
  int n;
  int arr[];
  public mystack(int n)
  {
    this.n=n;
    arr=new int[n];
  }

  
  int index=-1;

  void push(int a)
  {
    if(index<n-1)
    {
      index=index+1;
      System.out.println(index);
      arr[index]=a;
    }
    else{
      System.out.println("out of bound");
      return;
    }
   
  }

  int pop()
  {
    if(index<0)
    {
      System.out.println("under limit");
      return -1;
    }
    int res=arr[index];
    index=index-1;
    return res;
  }


  void display()
  {
    for(int i=0;i<=index;i++)
    {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

  int indexOf(int a)
  {
    
    for(int i=0;i<=index;i++)
    {
      if(a==arr[i])
      {
        return i;
      }
    }
    return -1;
  }
  int lastIndexOf(int a)
  {
    int res=-1;
    for(int i=0;i<=index;i++)
    {
      if(a==arr[index])
      {
        res=i;
      }
    }
    if(res==-1) return -1;
    else return res;

  }
}
class Stackobject
{
  public static void main(String args[])
  {
    mystack s=new mystack(10);
    s.push(1);
    s.push(2);
    s.push(3);
    for(int i=1;i<=9;i++)
    {
      s.push(i);
    }
    s.display();

    // for(int i=1;i<=15;i++)
    // {
    //   System.out.println(s.pop()+" ");
    // }
    System.out.println(s.indexOf(4));
    System.out.println(s.indexOf(10));
    s.pop();
    s.pop();
    s.display();
    s.push(1);
    System.out.println(s.lastIndexOf(1));

  }
}
