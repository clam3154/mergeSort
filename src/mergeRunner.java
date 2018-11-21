public class mergeRunner {
    public static void main(String[] args)
    {
        int[] arr = new int[50];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random()*10)+1;
        }
        MergeSort.mergeSort(arr);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + ",");
        }
    }
}
