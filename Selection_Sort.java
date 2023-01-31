public class Selection_Sort
{
    public static void selection_sort(int array[])
    {
        for(int i=0;i<array.length-1;i++)
        {
            int minPos=i;
            for(int j=i+1;j< array.length;j++)
            {
                if(array[minPos]>array[j])
                {
                    minPos=j;

                }
            }
            int temp=array[minPos];
            array[minPos]=array[i];
            array[i]=temp;
        }
    }


    public static void print_array(int array[])
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args)
        {
        int array[]={3,5,2,6,1,9,8,4,7};

        selection_sort(array);
        print_array(array);
    }
}

