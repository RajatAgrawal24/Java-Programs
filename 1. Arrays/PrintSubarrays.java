public class PrintSubarrays {
    public static void main(String[] args) {
        int arr[] = {9,5,8,3};
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
