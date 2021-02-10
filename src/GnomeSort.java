import  java.util.Arrays;

public class GnomeSort {
    

	void gnomeSort(Comparable<Integer> arr[], int n)
	{
		int index = 0;

		while (index < n) {
			if (index == 0)
				index++;
			if (arr[index].compareTo((Integer) arr[index - 1]) >= 0)
				index++;
			else {
				int temp = 0;
				temp = (int) arr[index];
				arr[index] = arr[index - 1];
				arr[index - 1] = temp;
				index--;
			}
		}
		return;
	}
  
}
