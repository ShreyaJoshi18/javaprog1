class Fibonacci
{
public static void main(String [] args)
  {
      int [] s;
      s=new int[10];
       s[0]=0;
        s[1]=1;
     
    for(int i=0;i<10;i++)
      {
       if(i==0)
         {
           System.out.print(s[0] +"\t");
          }
       else if(i==1)
          {
           System.out.print(s[1] +"\t");
         }
       else
       {
       s[i]=s[i-1]+s[i-2];
       System.out.print(s[i] +"\t");
       }
      }


   }
}