import java.util.Scanner;

public class PlayerChoiceMenu {

    public PlayerChoiceMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        while (choice != 3){
            if (choice < 1 || choice > 3){
                choice = scanner.nextInt();
            }
            else if (choice == 1){
                //Gör meny val 1
            }
            else if (choice == 2){
                //Gör meny val 2
            }
            else if (choice == 3){
                //Gör meny val 3
            }
        }

    }
}
