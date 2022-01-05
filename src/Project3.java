/* 
 * 
 * Description: This is a Project3 class that implements
 * the QuickSort sorting algorithm to sort integers, and 
 * it uses the median-of-three pivot choice methodology.
 * 
 */
public class Project3 {

	private int[] arr;
	private int count;
	private int capacity;
	private int numOfCompares;
	private int numOfSwaps;
	
	/* No-argument constructor */
	public Project3() 
	{
		this.capacity = 10;
		this.arr = new int[this.capacity];
		this.count = 0;
		this.numOfCompares = 0;
		this.numOfSwaps = 0;
	}
	
	/* Description: method Insert will insert the 
	 * parameter value into the unsorted array.
	 */
	public void Insert(int value)
	{
		/* Proceed with insert if we can fit another element into the array.
		   If we cannot, expand the array's capacity, then proceed with insert. */
		if(this.count == this.capacity) 
		{
			ExpandCapacity();	
		}

		this.arr[this.count] = value;
		this.count = this.count + 1;
	}
	
	/* Description: if count equals capacity in the array,
	 * method ExpandCapacity will increase the array's
	 * capacity to accommodate further inserts.
	 */
	private void ExpandCapacity()
	{
		int[] tempArr = new int[2 * this.capacity];
		
		for(int index = 0; index < this.count; index++) 
		{
			tempArr[index] = this.arr[index];
		}
		this.capacity = 2 * this.capacity;
		this.arr = tempArr;
	}
	
	/* Description: method toString will return a string
	 * representation of the array in Project3, with one
	 * integer per line.
	 */
	public String toString()
	{
		String numberSequence = "";
		
		for(int index = 0; index < this.count; index++)
		{
			numberSequence += this.arr[index] + "\n";
		} 
		
		return numberSequence;
	}
	
	/* Description: method Count will return the number
	 * of integers currently in the array in Project3.
	 */
	public int Count()
	{
		return this.count;
	}
	
	/* Description: method QuickSort will QuickSort the
	 * array. 
	 */
	public void QuickSort()
	{
		QuickSortArr(0, this.count - 1);
	}
	
	/* Median-of-three pivot choice methodology
	 * is implemented, and BubbleSort is used on any 
	 * subarray that has less than 10 items in it.
	 */
	private void QuickSortArr(int left, int right)
	{
		this.numOfCompares++;
		if((right - left + 1) >= 10)
		{
			int medianValue = MedianOfThree(left, right);
			int partitionPt = PartitionArr(left, right, medianValue);
			QuickSortArr(left, partitionPt - 1);
			QuickSortArr(partitionPt + 1, right);
		}
		else
		{
			/* BubbleSort subarrays with a size of less than 10 */
			BubbleSort(left, right);
		}
		
	}
	
	/* Description: method MedianOfThree determines the
	 * median of three values (left, center, right), and 
	 * the determined median will be used as the pivot
	 * choice in QuickSort.
	 */
	private int MedianOfThree(int left, int right) 
	{
		int center = (left + right) / 2;
		
		this.numOfCompares++;
		if(this.arr[left] > this.arr[center])
		{
			this.numOfSwaps++;
			SwapElements(left, center);
		}
		
		this.numOfCompares++;
		if(this.arr[center] > this.arr[right])
		{
			this.numOfSwaps++;
			SwapElements(center, right);
		}
		
		this.numOfCompares++;
		if(this.arr[center] < this.arr[left])
		{
			this.numOfSwaps++;
			SwapElements(center, left);
		}
		
		/* Swapping the pivot with the next-to-last element. */
		this.numOfSwaps++;
		SwapElements(center, right-1);
		
		return this.arr[right - 1];
	}
	
	/* Description: method PartitionArr partitions the array
	 * by using the pivot determined from the MedianOfThree
	 * method.
	 */
	private int PartitionArr(int left, int right, int pivotValue)
	{
		int leftPointer = left;
		int rightPointer = right - 1;
		
		while(true)
		{
			while(this.arr[++leftPointer] < pivotValue)
			{
				this.numOfCompares++;
			}
			this.numOfCompares++;
			
			while(this.arr[--rightPointer] > pivotValue)
			{
				this.numOfCompares++;
			}
			this.numOfCompares++;
			
			this.numOfCompares++;
			if(leftPointer < rightPointer)
			{
				this.numOfCompares++; 
				this.numOfCompares++;
				if(this.arr[leftPointer] == pivotValue & this.arr[rightPointer] == pivotValue)
				{
					/* When both pointers stop at duplicates equal to the pivot,
					 * no swapping occurs. */
					continue;
				}
				this.numOfSwaps++;
				SwapElements(leftPointer, rightPointer);
			}
			else
			{
				/* The two pointers have crossed. */
				break;
			}
		}
		
		/* Pivot is restored by swapping the element in
		   position leftPointer with the pivot. */
		this.numOfSwaps++;
		SwapElements(leftPointer, right - 1);
		return leftPointer;
	}
	
	/* Description: method SwapElements will swap
	 * the two numbers at the given indexes.
	 */
	private void SwapElements(int index1, int index2)
	{
		int temp = this.arr[index2];
		this.arr[index2] = this.arr[index1];
		this.arr[index1] = temp;
	}
	
	/* Description: method sortStats will return a string
	 * that lists the number of comparisons and swaps for
	 * the last use of QuickSort.
	 */
	public String sortStats()
	{
		String sortingStats = "";
		
		sortingStats = "\n" + "Number of Comparisons: " + this.numOfCompares 
				+ "\n\n" + "Number of Swaps: " + this.numOfSwaps + "\n";
		
		return sortingStats;
	}
	
	/* Description: method BubbleSort will be called by method
	 * QuickSortArr when any subarray's size is less than 10.
	 * BubbleSort will sort the array indices [start...end].
	 */
	private void BubbleSort(int start, int end)
	{	
		int upperBound = end;
		for(int i = start; i < end; i++)
		{
			for(int j = start; j < upperBound; j++)
			{
				this.numOfCompares++;
				if(this.arr[j] > this.arr[j+1])
				{
					this.numOfSwaps++;
					SwapElements(j+1, j);
				}
			}
			
			--upperBound;
		}
	}

}
