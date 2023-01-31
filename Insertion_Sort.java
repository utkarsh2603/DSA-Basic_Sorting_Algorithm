public class Insertion_Sort
{
    public static void insertion_sort(int array[])
    {
        for(int i=1;i<array.length;i++)
        {
            int curr=array[i];
            int prev=i-1;

            while(prev>=0 && array[prev]>curr)
            {
                array[prev+1]=array[prev];
                prev--;
            }
            array[prev+1]=curr;
        }
    }
    public static void print_array(int array[])
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        int array[]={3,5,2,6,1,9,8,4,7};

        insertion_sort(array);
        print_array(array);
    }


}
