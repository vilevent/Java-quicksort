# Quicksort for integers, in Java
> Programming assignment from Fall 2020 Data Structures course. Assignment description is below.


### Creating a Java class called `Project3`
- The class will store integers. Each call to the method Insert will simply add the value to the end of the array (i.e., the array remains unsorted). 
- The user should be able to call Insert as much as they want. The array inside Project3 should be dynamic.

Methods:

`void Insert(int value)` Inserts value into the unsorted Array

`String toString()` should return a string representation of the array. The output should be one integer per line from element 0 to element n-1 (where n is the
number of elements currently in the array).

`int Count()` The number of integers currently in the array in Project3

`void QuickSort()` This method will Quicksort the array 

You must implement the quicksort method in class with the following caveats:

   **1.** You MUST use the median-of-three pivot choice methodology.
    
   **2.** When a subarray has less than 10 items in it, your QuickSort method should BubbleSort that subarray.
    
    
`String sortStats()` This method will return a string with the following statistics of the last use of QuickSort:

*Number of Comparisons: ###*
     
*Number of Swaps: ###*
     
*Where ### is an integer representing the metric*
