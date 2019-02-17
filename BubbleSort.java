public class BubbleSort implements SortingAlgorithm 
{
	//Swap function takes a temporary variable to switch two values in array.
	public void swap (int[] a, int i, int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	//Sort function uses boolean to check if entire array has been sorted.
	public void sort (int[] a)
	{
		boolean swapped = true;
		//Enters this for-loop multiple times until array has been correctly sorted.
		for (int i = 0; i < a.length - 1 && swapped; i++)
		{
			swapped = false;
			//Sorts the array.
			for (int j = 0; j < a.length - 1 - i; j++)
			{
				//If there are no swaps being made, the array has been correctly sorted and the code finishes.
				if (a[j] > a[j + 1])
				{
					swap(a, j, j+1);
					swapped = true;
				}		
			}
		}		
	}
}