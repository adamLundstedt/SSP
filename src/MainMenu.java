import java.util.Scanner;

public class MainMenu {
    Scanner scanner = new Scanner(System.in);

    public MainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("Välkommen till Sten, Sax eller Påse.");
        System.out.println("------------------------------------");
        System.out.println("");
        System.out.println("Main Menu");
        System.out.println("*** *** *** ");
        System.out.println("");
        System.out.println("1. Ny Match");
        System.out.println("2. Historik");
        System.out.println("3. Avsluta Spelet");
        int choice = scanner.nextInt();

        while (choice != 3){
            if (choice < 1 || choice > 3){
                choice = scanner.nextInt();
            }
            else if (choice == 1){ //Nytt spel valet.
                //Gör meny val 1
                System.out.println("test menyval 1");
                break;
            }
            else if (choice == 2){ //Historik valet.
                //Gör meny val 2
                System.out.println("test menyval 2");

            }
            else if (choice == 3){ // Avslutar spelet.
                //Gör meny val 3
                break;
            }
        }

    }

}
