public class PairsInArray {
    public static void main(String[] args) {
        int arr[] = {9,5,8,3,6,1,0,32};
        int totalPairs = 0;
        
        for(int i=0;i<arr.length;i++) {
            int curr = arr[i];
            for(int j=i+1;j<arr.length;j++) {
                System.out.print("("+curr+","+arr[j]+")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs : "+totalPairs);
    }
}
