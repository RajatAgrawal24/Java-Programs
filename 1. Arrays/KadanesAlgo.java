public class KadanesAlgo {
    public static void maxSubarraySum(int arr[]){
        int n = arr.length;
        int currSum = arr[0];
        int maxSum = arr[0];

        for(int i=1;i<n;i++){
            currSum = Math.max(arr[i], currSum+arr[i]);
            System.out.print(currSum+" ");
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("\nMax Subarray Sum : " + maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        maxSubarraySum(arr);
    }
}
