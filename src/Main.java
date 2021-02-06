import java.util.Random;

public class Main {

    public static void main(String[] args) {


        MergeSort merge = new MergeSort();
        QuickSort quick = new QuickSort();
        Random rd = new Random();

        int arr[] = new int[30000];

        for(int i = 0; i < 30000; i++){
            arr[i] = rd.nextInt(30000);
        }

        //merge.sort(arr, 0, arr.length - 1);
        quick.sort(arr, 0, arr.length - 1);

        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();

    }

}
