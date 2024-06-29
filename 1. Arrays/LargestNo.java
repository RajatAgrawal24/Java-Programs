public class LargestNo {
    public static void main(String[] args){
        int arr[] = {9,5,8,3,6,1,0,32};
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("max = " + max);
    }
}
