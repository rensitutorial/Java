import java.util.Scanner;

public class Pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char ch = sc.next().charAt(0);

        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("The entered character is a Vowel.");
        } else {
            System.out.println("The entered character is a Consonant.");
        }

        
    }
}

//output: Enter a letter: A
//The entered character is a Vowel.
