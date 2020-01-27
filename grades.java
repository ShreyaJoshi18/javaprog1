import java.util.Scanner;
class grades
{
 
 public static void main(String args[])
 
{
int [] arr=new int[20];
  int i,j,temp;
Scanner sc=new Scanner(System.in);
System.out.print("Enter marks of students");

for(i=0;i<10;i++)
  {
   arr[i]=sc.nextInt();       
 
  }
System.out.print("Marks in assending order");
for(i=0;i<10;i++)
  {
    for(j=i+1;j<10;j++)
     {
   if(arr[i]>arr[j])
     {
       temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
      }
      }
    }
for(i=0;i<10;i++)
  {
System.out.print(arr[i] + "\t");
  }
System.out.print("\n");
System.out.print("\t Marks \t Grades\n");
for(i=0;i<10;i++)
  {
   if(39<arr[i] && arr[i]<51)
     {
      System.out.println("\t" + arr[i] + "\tPass");
     }
   else if(50<arr[i]&&arr[i]<76)
     {
      System.out.println("\t" + arr[i] + "\tMerit");
    
     }
   else if(arr[i]>75)
    {
     System.out.println("\t" + arr[i] + "\tDistinction");
     
    }
  }
}
}
