public class Q9 {

  public int maxDigit(int num)
  {
    int maxDigit = 0;

    while(num > 0)
    {
      int digit = num %10;
      if(digit > maxDigit)
      {
        maxDigit = digit;
      }  
      num /= 10;
    }
    return maxDigit;
  }
  
}
