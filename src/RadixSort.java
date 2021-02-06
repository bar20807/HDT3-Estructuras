import  java.util.Arrays;

public class RadixSort {


    /**Se itera sobre todo el array y se encuentra el valor mas alto*/
    static int getMaximo(int arr[], int n)
    {
        int max = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    /**Se recorre el array, sabiendo el valor mas alto, y se ordena por pasos.
     * Inicialmente se ordena por las unidades en los valores del arreglo,
     * Luego por las decenas, dejando a los que unicamente tienen unidades al inicio,
     * de esta manera hasta llegar a la cantidad de digitos del valor mas alto.*/
    static void countSort(int arr[], int n, int exp)
    {
        int resultado[] = new int[n];
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);

        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (i = n - 1; i >= 0; i--) {
            resultado[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (i = 0; i < n; i++)
            arr[i] = resultado[i];
    }


    /**Funcion para llamar al sort y hacer el proceso correspondiente.*/

    static void sort(int arr[], int n)
    {

        int m = getMaximo(arr, n);

        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }
}
