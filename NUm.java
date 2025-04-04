public class NUm {

  public static int missingNum (int [] arr)
  {
    int prevDiff = 0;
    for(int i = 0; i < arr.length; i++)
    {
      prevDiff = arr[i+1] - arr[i];
      if(arr[i+1]- arr[i] != prevDiff)
      {
        return (arr[i] += prevDiff); 
      }
    } 
    return 0;
  }
  
}
