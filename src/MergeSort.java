public class MergeSort {



    public void merge(Comparable<Integer> arr[], int l, int m, int r)
    {
        // Encuentra el tamano de los sub arreglos que se dividen del arreglo principal.
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Se instancian los sub arreglos que se utilizaran en el proceso */
        Comparable<Integer> L[] = new Comparable[n1];
        Comparable<Integer> R[] = new Comparable[n2];

        /*Se toman los datos de el arreglo mayor y, segun su indice, se agregan a los sub arreglos*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Indices iniciales de los sub arreglos
        int i = 0, j = 0;

        // Indice inicial del arreglo principal
        int k = l;

        /*Se recorren los datos y se ordenan*/
        while (i < n1 && j < n2) {
            if (L[i].compareTo((Integer) R[j]) <= 1 ) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Se copian los elementos restantes de L[] si es que hay */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Se copian los elementos restantes de R[] si es que hay */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public void sort(Comparable<Integer> arr[], int l, int r)
    {
        if (l < r) {
            // Se encuentra el punto intermedio
            int m =l+ (r-l)/2;

            // Se sortean las dos mitades
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Se realiza el proceso con las mitades generadas.
            merge(arr, l, m, r);
        }
    }
}
