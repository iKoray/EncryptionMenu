import java.util.Scanner;

public class EncryptionMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("Choose an encryption method:");
            System.out.println("1. Caesar Cipher");
            System.out.println("2. Vigenère Cipher");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 3) {
                System.out.println("Exiting...");
                break;
            }

            switch(choice) {
                case 1:
                    System.out.println("Welcome to Caesar Cipher.");
                    System.out.println("The Caesar Cipher shifts each letter in the text by a certain number of positions in the alphabet.");
                    System.out.println("Enter the text to encrypt: ");
                    String text = sc.nextLine();
                    System.out.println("Enter the shift value: ");
                    int shift = sc.nextInt();
                    sc.nextLine();
                    //finish caesar function
                    break;
                case 2:
                    System.out.println("Welcome to Vigenère Cipher!");
                    System.out.println("The Vigenère Cipher uses a keyword to shift each letter based on the corresponding letter's position in the alphabet.");

                    System.out.print("Enter the text to encrypt: ");
                    String vigenereText = sc.nextLine();
                    //work in progress
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println();
        }
        sc.close();
    }

    //public static String caesarCipher(String text) {
        //work in progress
    //}
    //public static String vigeneCipher(String text) {
        //work in progress
    //}
}
