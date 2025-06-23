public class faultyKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name string:");
        String name = sc.nextLine();
        System.out.println("Enter the typed string:");
        String typed = sc.nextLine();

        int i = 0;
        int j = 0;
        boolean isValid = true;

        while(i<name.length() && j<typed.length()){
            if(name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            }
            else if(name.charAt(i-1) == typed.charAt(j)){
                j++;
            }
            else{
                return false; 
            }
        }
    }
}
