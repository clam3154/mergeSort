public class mergeSort
{
    public static void mergeSort(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        mergeSortHelper(arr, 0, n - 1, temp);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + ",");
        }
    }
    public static void mergeSortHelper(int[] arr, int left, int right, int[] temp)
    {
        if(left<right)
        {
            int mid = (left+right)/2;
            mergeSortHelper(arr,left,mid,temp);
            mergeSortHelper(arr,mid+1,right,temp);
            merge(arr,left,mid,right,temp);
        }
    }
    public static void merge(int[] arr, int left, int mid, int right, int[] temp)
    {
        int i = left;
        int j = mid+1;
        int k = left;
        while(i <= mid+1 && j <= right)
        {
            if(arr[i] < arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid)
        {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j <= right)
        {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for(int x = left; x <= right; x++)
        {
            arr[x] = temp[x];
        }
    }
}
