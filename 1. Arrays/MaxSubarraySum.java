public class MaxSubarraySum {
    public static void maxSubarraySum(int[] arr){
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int currSum=0;
                for(int k=i;k<=j;k++){
                    currSum+=arr[k];
                }
                System.out.print(currSum+" ");
                maxSum = Math.max(maxSum,currSum);
            }
        }
        System.out.println("\nMax Subarray Sum : " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        maxSubarraySum(arr);
    }
}
