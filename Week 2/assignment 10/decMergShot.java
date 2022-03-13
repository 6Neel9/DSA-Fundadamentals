// Java program to sort a string in descending
// order using library function
import java.util.*;

public class decMergShot
{

	static void descOrder(char[] s)
	{
		Arrays.sort(s);
		reverse(s);
	}

	static void reverse(char[] a)
	{
		int i, n = a.length;
		char t;
		for (i = 0; i < n / 2; i++)
		{
			t = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = t;
		}
	}

	// Driver code
	public static void main(String[] args)
	{
		char[] s = {'a','x','y','b','A','T','t'};
		descOrder(s); 
        System.out.println(s);
	}
}



