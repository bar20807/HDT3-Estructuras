import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class GnomeSortTest {

    int cantidad = 100;

    @Test
    public void gnomeSort() {
        Random rd = new Random();
        GnomeSort gs = new GnomeSort();
        Comparable arr[] = new Comparable[cantidad];


        for(int i = 0; i < cantidad; i++){
            arr[i] = rd.nextInt(cantidad);
        }

        gs.sort(arr, arr.length -1);
    }
}