public class QuickSort {

    int Quick(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // Indice del objeto mas pequeno
        for (int j=low; j<high; j++)
        {
            // Si el elemento es mas pequeno que el pivote
            if (arr[j] < pivot)
            {
                i++;

                // intercambiar arrays
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // intercambiar arr[i+1] y arr[high] (o el pivote)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }


    /* La funcion principal que corre el sort*/
    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            int pi = Quick(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
}
