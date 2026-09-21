import java.util.Scanner;

public class Skenario2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Status Member: ");
        String statusMember = input.nextLine();
        
        switch (statusMember) {
            case "GOLDEN":
                System.out.println("Diskon 20%");
                break;
            case "SILVER":
                System.out.println("Diskon 15%");
                break;
            case "BRONZE":
                System.out.println("Diskon 10%");
                break;
            default:
                System.out.println("Diskon 0%");
            }
        
    }
}