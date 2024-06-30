public class ReverseArray {
    public static void reverseArray(int[] arr){
        int si=0;
        int ei=arr.length-1;

        while(si<ei){
            //swap
            int temp = arr[si];
            arr[si]=arr[ei];
            arr[ei]=temp;

            si++;
            ei--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {9,5,8,3,6,1,0,32};
        reverseArray(arr);

        //To Print Array
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
