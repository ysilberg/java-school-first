import java.util.Scanner;
public class Q_twelve{
public static Scanner input=new Scanner(System.in);
  public static void main( String arg[]){
  int num1=input.nextInt();
  int num2=input.nextInt();
  int num3=input.nextInt();
  if( num2-1==num1&& num3-num2==1)
  System.out.println("Yes");
  else
  System.out.println("No");
  }
}

