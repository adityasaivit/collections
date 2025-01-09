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

    for(int i=1;i<=15;i++)
    {
      System.out.println(s.pop()+" ");
    }
  
  }
}
