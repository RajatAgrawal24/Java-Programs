import java.util.*;

public class PrimeNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n= sc.nextInt();

        if(n==2){
            System.out.println(n + "is a prime number .");
        }else{
            boolean isPrime = true;
            int e = (int)Math.sqrt(n);
            for(int i=2; i<=e; i++){
                if(n%i==0){
                    isPrime = false;
                }
            }
            if(isPrime) System.out.println(n + " is a prime number");
            else System.out.println(n + " is not a prime number");
        }

        sc.close();
    }
}
