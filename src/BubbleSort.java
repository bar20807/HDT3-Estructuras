
/**
 * @author barre
 *
 */
public class BubbleSort {

	public void sort(Comparable arr[], int n) {
		int i, j;
		Comparable swap;
		for (i = 0; i < n; i++) {
			for (j = 0; j < arr.length - 1; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					swap = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = swap;
				}
			}
		}
	}

}

