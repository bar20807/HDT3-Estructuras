import java.util.Random;
public class Main {

    public static void main(String[] args) {


        MergeSort merge = new MergeSort();
        QuickSort quick = new QuickSort();
        RadixSort radix = new RadixSort();
        GnomeSort gnome = new GnomeSort();
        BubbleSort bubble = new BubbleSort();
        Random rd = new Random();

        Comparable arr[] = new Comparable[3000];

        for(int i = 0; i < 3000; i++){
            arr[i] = rd.nextInt(3000);
        }

        //merge.sort(arr, 0, arr.length - 1);
        //quick.sort(arr, 0, arr.length - 1);
        //radix.sort(arr, arr.length -1);
        //gnome.sort(arr, arr.length -1);
        //bubble.sort(arr, arr.length -1);

        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();

    }

}
