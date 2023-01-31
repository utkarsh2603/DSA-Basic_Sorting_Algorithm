public class Bubble_Sort
{
    public static void bubbleSort(int array[])
    {
        for(int i=0;i< array.length-1;i++)
        {
            for(int j=0;j< array.length-1-i;j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
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

        bubbleSort(array);
        print_array(array);
    }
}
