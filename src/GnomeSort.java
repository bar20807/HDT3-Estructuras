import  java.util.Arrays;

public class GnomeSort {
    

	void sort(Comparable arr[], int n)
	{
		int index = 0;

		while (index < n) {
			if (index == 0)
				index++;
			if (arr[index].compareTo( arr[index - 1]) >= 0)
				index++;
			else {
				Comparable temp = 0;
				temp = arr[index];
				arr[index] = arr[index - 1];
				arr[index - 1] = temp;
				index--;
			}
		}
		return;
	}
  
}
