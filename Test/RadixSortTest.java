import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class RadixSortTest {

    int cantidad = 2000;
    @Test
    public void sort() {
        Random rd = new Random();
        RadixSort rs = new RadixSort();
        Comparable arr[] = new Comparable[cantidad];


        for(int i = 0; i < cantidad; i++){
            arr[i] = rd.nextInt(cantidad);
        }

        rs.sort(arr, arr.length -1);
    }
}