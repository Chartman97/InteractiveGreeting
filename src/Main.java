import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int age;
        final double donate;
        String name, origin, favAct, empty;

    // What their name is
        System.out.println("\nHello, I am the robit that will be asking you questions today.");
        System.out.print("What is your name? \nEnter Here -> ");
        name = in.nextLine();

    // Where they are from
        System.out.print("\nVery cool!\nNow, Where are you from? \nEnter Here -> ");
        origin = in.nextLine();

    // How old they are
        System.out.print("\nThat is so interesting!\nNow, how old are you?\nEnter Here -> ");
        age = in.nextInt();

    // First output
        System.out.printf("\nHello, " + name + " I hope you are doing well.\n");
        System.out.printf("I see here that you are " + age + " years old.\n");
        System.out.printf("It says you are from " + origin + " , How Cool!\n");

    // Transition
        System.out.println("\nI have a couple more questions for you.");
        System.out.print("May I ask them? Enter here -> ");
        empty = in.nextLine();
        empty = in.nextLine(); // Only way it would work is if i added 2 lines of the same code. Idk why..

    // What is their favorite activity
        System.out.println("\nYour answer really doesn't matter.\nWhat would you say your favorite activity is?");
        System.out.print("Enter Here -> ");
        favAct = in.nextLine();

    // How much will they donate today
        System.out.println("\nI don't like " + favAct + ", but that's okay. To each their own");
        System.out.println("Lastly, We are so pleased to hear you are wanting to donate to our cause.");
        System.out.print("How much would you be willing to provide? Enter Here -> ");
        donate = in.nextDouble();

    // Final output
        System.out.printf("\nWell, well, well, " + name + ", I knew anyone that liked " + favAct);
        System.out.println(" would donate a gracious amount, like you just did");
        System.out.println("Thank you so much for your donation of $" + donate + " dollars");

        System.out.print("\nGood Bye!");

    }
}