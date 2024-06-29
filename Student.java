import java.util.*;
class Student {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element "+ (i+1)+" : ");
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}