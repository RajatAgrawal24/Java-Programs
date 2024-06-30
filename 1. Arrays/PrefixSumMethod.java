public class PrefixSumMethod {
    public static void maxSubarraySum(int[] arr){
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        int prefixSum[] = new int[n];
        prefixSum[0] = arr[0];
        for(int i=1;i<n;i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int currSum = i==0 ? prefixSum[j] : prefixSum[j] - prefixSum[i-1];
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
