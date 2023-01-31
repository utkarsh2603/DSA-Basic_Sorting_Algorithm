import java.util.Arrays;
import java.util.Collections;

public class Inbuilt_Sort
{
    public static void main(String[] args) {
        int array[]={2,5,3,4,7,9,8,6,1};

        Arrays.sort(array);

        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        Integer arrays[]={2,5,3,4,7,9,8,6,1};

        Arrays.sort(arrays,Collections.reverseOrder());

        for(int i=0;i<arrays.length;i++)
        {
            System.out.print(arrays[i]+" ");
        }
    }
}
