import java.util.Scanner;

public class Q_{

  public static void main(String[] args) {
    int new_num , num=258 ;
    int sod1 , sod2 , sod3 , temp ;
    sod1=num % 10 ;
    temp=num / 10 ;
    sod2= temp % 10 ;
    sod3= temp / 10 ;
    new_num= sod1*100+sod2*10+sod3 ;
    System.out.println(sod1);
    System.out.println ("the new number is : " + new_num) ;
    
      
  }
}