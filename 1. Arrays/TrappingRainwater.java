public class TrappingRainwater {
    public static int trappedRainwater(int[] arr){
        int trappedWater = 0;
        int n= arr.length;

        //leftMax
        int leftMax[] = new int[n];
        leftMax[0] = arr[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }

        //rightMax
        int rightMax[] = new int[n];
        rightMax[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }

        //trappedWater
        for(int i=0;i<n;i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - arr[i];
        }

        return trappedWater;
    }
    public static void main(String[] args) {
        int heights[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("TrappedRainwater : " + trappedRainwater(heights));
    }
}
