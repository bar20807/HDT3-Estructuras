/**
 * 
 */

/**
 * @author barre
 *
 */
public class BubbleSort {

	public void Sort(Comparable<Integer> arr[], int n) {
		int i, j, swap;

		for (i = 0; i < n; i++) {
			for (j = 0; j < arr.length - 1; j++) {
				if (arr[j].compareTo((Integer) arr[j + 1]) == 1) {
					swap = (int) arr[j];        // place the bigger number to swap
					arr[j] = arr[j + 1];    // place the smaller number
					arr[j + 1] = swap;
				}
			}
		}
	}

}

