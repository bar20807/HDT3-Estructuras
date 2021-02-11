import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class MergeSortTest {

    int cantidad = 2000;

    @Test
    public void sort() {
        Random rd = new Random();
        MergeSort gs = new MergeSort();
        Comparable arr[] = new Comparable[cantidad];


        for(int i = 0; i < cantidad; i++){
            arr[i] = rd.nextInt(cantidad);
        }

        gs.sort(arr, 0, arr.length - 1);
    }
}