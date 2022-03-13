public class evennumbers {
    static void SumOfEven(int arr[],   
                      int i, int sum)
{
 
    // If current index is invalid i.e. all
    // the elements of the array
    // have been traversed
    if (i < 0)
    {
 
        // Print the sum
        System.out.print(sum);
        return;
    }
 
    // If current element is even
    if ((arr[i]) % 2 == 0)
    {
 
        // Add it to the sum
      System.out.println(arr[i]);
    }
 
    // Recursive call for the next element
    SumOfEven(arr, i - 1, sum);
}
 
// Driver code
public static void main (String[] args)
              throws java.lang.Exception
{
    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
    int n = arr.length;
    int sum = 0;
 
    SumOfEven(arr, n - 1, sum);
}
}
