import java.util.Scanner;
class Adder{
public static void main (String[]args)  {
  Scanner sc=new Scanner(System.in);  
  System.out.print("Enter x:");
  int x=sc.nextInt();
  System.out.print("Enter y:");
  int y=sc.nextInt();
  int Sum=x+y;
  System.out.println("Answer is "+Sum);

  }
}