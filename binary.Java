import java.util.Scanner;

public class Main
{

  public static void main (String[]args)
  {

    int i, j;

    Scanner input = new Scanner (System.in);

      System.out.println ("Enter the length of the array : ");

    int n = input.nextInt ();

      System.out.println ("Enter the element to be searched : ");

    int k = input.nextInt ();

    int a[] = new int[n];

    int count = 0;

      System.out.println ("Enter the array elements : ");

    for (i = 0; i < n; i++)
      {

	a[i] = input.nextInt ();

      }

    int start = 0, end = n - 1, mid = (n - 1) / 2;

    boolean found = false;

    while (start <= end)
      {

	mid = (start + end) / 2;

	if (a[mid] == k)
	  {

	    found = true;

	    break;

	  }

	else if (a[mid] > k)
	{

	end = mid - 1; }

	else
	{

	  start = mid + 1;

	}

      }

    if (found)
      {

	System.out.println ("element is found at index " + mid);

      }

    else
      {

      System.out.println ("no such element is present in array"); }
  }
}
