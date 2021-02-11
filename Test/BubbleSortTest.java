import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class BubbleSortTest {

    int cantidad = 10;
    @Test
    public void sort() {
        Random rd = new Random();
        BubbleSort bs = new BubbleSort();
        Comparable arr[] = new Comparable[cantidad];


        for(int i = 0; i < cantidad; i++){
            arr[i] = rd.nextInt(cantidad);
        }

        bs.sort(arr, arr.length -1);

    }
}