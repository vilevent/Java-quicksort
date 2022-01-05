
public class TestProj3 {

	public static void main(String[] args) {
		
		Project3 array1 = new Project3();
		
		array1.Insert(-81);
		array1.Insert(-7);
		array1.Insert(4);
		array1.Insert(510);
		array1.Insert(-2);
		array1.Insert(8);
		array1.Insert(21);
		array1.Insert(214);
		array1.Insert(-127);
		array1.Insert(185);
		array1.Insert(-14);
		array1.Insert(-161);
		array1.Insert(91);
		array1.Insert(-5);
		array1.Insert(48);
		array1.Insert(9);
		array1.Insert(102);
		array1.Insert(28);
		array1.Insert(-29);
		array1.Insert(13);
		array1.Insert(21);
		array1.Insert(18);
		array1.Insert(8);
		array1.Insert(0);
		array1.Insert(21);
		array1.Insert(-12);
		array1.Insert(13);
		array1.Insert(21);
		array1.Insert(1);
		array1.Insert(-12);
		array1.Insert(5);
		array1.Insert(4);
		array1.Insert(510);
		array1.Insert(61);
		array1.Insert(83);
		array1.Insert(210);
		array1.Insert(-123);
		array1.Insert(135);
		array1.Insert(-1);
		array1.Insert(-16);
		array1.Insert(90);
		array1.Insert(-5);
		array1.Insert(48);
		array1.Insert(0);
		array1.Insert(0);
		array1.Insert(-11);
		array1.Insert(-21);
		array1.Insert(-9);
		array1.Insert(-58);
		array1.Insert(-48);
		
		System.out.print("Unsorted...");
		System.out.println();
		String arrayRep = array1.toString();
		System.out.printf("%s", arrayRep);
		int countValue = array1.Count();
		System.out.printf("Count is: %d", countValue);
		System.out.println();
		
		System.out.print("\nQuickSort now...");
		System.out.println();
		array1.QuickSort();
		
		arrayRep = array1.toString();
		System.out.printf("%s", arrayRep);
		
		String sortingStatistics = array1.sortStats();
		System.out.printf("%s", sortingStatistics);

	}

}
