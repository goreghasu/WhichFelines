import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String felineInput;
        Feline feline;

        System.out.print("Are you a lion or a cat? (Please enter your answer in all lowercase): ");
        felineInput = input.nextLine();

        while (!(felineInput.equals("lion")) && !(felineInput.equals("cat"))) {
            System.out.print("Please enter either lion or cat in all lowercase: ");
            felineInput = input.nextLine();
        }

        if (felineInput.equals("lion")) {
            feline = new Lion();
        } else {
            feline = new Cat();
        }

        System.out.print("You say ");
        feline.makeSound();

        input.close();
    }
}
