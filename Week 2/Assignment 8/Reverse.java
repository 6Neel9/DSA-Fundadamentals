
import java.util.*;
public class Reverse
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
		char[] s = "geekster".toCharArray();
		descOrder(s); 
		System.out.println(String.valueOf(s));
	}
}


