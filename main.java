public class main {
    public static void main(String[] args) {
        main test= new main();
        int[] arr={-12,23,4,-67,0,364,-9};
        //test.merge(arr1,arr2);
        for(int x: test.mergeSort(arr))
        {
            System.out.println(" " + x);
        }

    }
    public int[] merge(int[] arr1, int[] arr2)
    {
        int[] arr=new int[arr1.length+arr2.length];
        int index1=0,index2=0,i=0;

        while(index1<arr1.length && index2<arr2.length)
        {
            if(arr1[index1]<arr2[index2])
            {
                arr[i++]=arr1[index1++];
            }
            else {
                arr[i++]=arr2[index2++];
            }
        }
        while(index1<arr1.length)
        {
            arr[i++]=arr1[index1++];
        }
        while(index2<arr2.length)
        {
            arr[i++]=arr2[index2++];
        }
        return arr;
    }
    public int[] mergeSort(int[] arr)
    {
        if(arr.length==1)
        {
          return arr;
        }
        int[] arr1,arr2;
        int t=Math.round(arr.length/2);
        arr1=new int[t];
        arr2=new int[arr.length-t];
        for(int i=0;i<t;i++)
        {
           arr1[i]=arr[i];
        }
        for(int i=t,j=0;i<arr.length;i++)
        {
            arr2[j++]=arr[i];
        }
        return merge(mergeSort(arr1),mergeSort(arr2));



    }


}
