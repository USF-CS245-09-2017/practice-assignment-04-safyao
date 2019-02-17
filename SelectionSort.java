public class SelectionSort implements SortingAlgorithm 
{
	//Swap function takes a temporary variable to switch two values in array.
	public void swap (int[] a, int i, int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	//Smallest function finds smallest value in array.
	public int smallest (int[] a, int start)
	{
		int smallest = start;
		for (int i = start + 1; i < a.length; i++)
		{
			if (a[i] < a[smallest])
			{
				smallest = i;
			}
		}
		return smallest;
	}
	
	//Sort function finds smallest element in list and switches it to the ith index.
	public void sort (int[] a)
	{
		for (int i = 0; i < a.length - 1; i++)
		{
			swap(a, i, smallest(a, i));
		}
	}
}