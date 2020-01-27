class Calculator
{
 public static void main(String [] args)  
   { 
    int a,b;
    
    a=Integer.parseInt(args[0]);
    b=Integer.parseInt(args[2]);

          if(args[1].equals("+"))
           {
            System.out.print(a+b);             
            }
           else if(args[1].equals("-"))
              {
             System.out.print(a-b);
               }
           else if(args[1].equals("*"))
              {
              System.out.print(a*b);
               }
            else 
              {
               System.out.print(a/b);
              }


         
    }
}