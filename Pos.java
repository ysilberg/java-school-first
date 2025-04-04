public class Pos {
  static Boolean posOrder(int[] arr)
  {
    int prevNum = Integer.MIN_VALUE;
    for(int i = 0; i < arr.length; i++)
    {
      if(arr[i] < 0 || arr[i] < prevNum)
      {
        return false;
      }
    } 

    return true;
  }
  
}
