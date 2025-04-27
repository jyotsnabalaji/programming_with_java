import java.util.*;
public class reverseOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        while(temp > 0){
            int dig = temp%10;
            temp = temp/10;
            System.out.print(dig);
        }
        sc.close();
    }
    
}
