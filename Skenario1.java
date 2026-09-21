import java.util.Scanner;

public class Skenario1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nilai: ");
        int nilai = input.nextInt();

        if (nilai < 0 || nilai > 100) {
            System.out.println("Invalid");
        } else {
            if (nilai>=80) {
            System.out.println("Nilai A");} 
            else if (nilai >= 70) {
            System.out.println("Nilai B");} 
            else if (nilai >= 55) {
            System.out.println("Nilai C");} 
            else {
            System.out.println("Nilai D");}
        }
    }
}      
