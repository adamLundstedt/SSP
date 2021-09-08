import java.util.Scanner;

public class AfterMatchMenu {

    public AfterMatchMenu {
        Scanner scanner = new Scanner(System.in);
        MainMenu mainMenu = new MainMenu();
        PlayerChoiceMenu = new PlayerChoiceMenu();
        System.out.println("** ** ** ** ** ** ** **");
        System.out.println("");
        System.out.println("1. Huvudmeny  2. Spela igen  3. Avsluta Spelet");
        System.out.println("*");
        System.out.println("");
        System.out.println("*");
        int choice = scanner.nextInt();

        while (choice != 3) {

            if (choice < 1 || choice > 3) {
                choice = scanner.nextInt();
            }
            else if(choice == 1) { // Återgår till MainMenu
                System.out.println(mainMenu);
            }
            else if(choice == 2) { // Kör PlayerChoiceMenu igen
                System.out.println(PlayerChoiceMenu);
            }
            else if(choice == 3) { // Avslutar spelet
                break;
            }



    }
}
