import java.util.*;

public class primeBruteForce{
public static void main(String[] args){
    // System.out.println("Hello Worlds");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number of Test Cases: ");
    int t = sc.nextInt();

    for(int i=0; i<t; i++){
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int count = 0;
        for(int div=1; div<=n; div++){
            if(n%div == 0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }

    }
}
}