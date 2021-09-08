import java.util.Random;
import java.util.Scanner;

public class TheGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String sten, sax, påse;

        System.out.println("Välkommen till ett spel i sten, sax och påse.");

        while (true){
            System.out.println("För att välja skriv sten, sax eller påse.");
            System.out.println("För att avsluta, skriv avsluta.");
            System.out.println("Vad är ditt val?");
            System.out.println("//////////");

            System.out.println("-------");
            String mittVal = scanner.nextLine();

            if (mittVal.equals("avsluta")){
                break;
            }
            if (!mittVal.equals("sten") && !mittVal.equals("sax") && !mittVal.equals("påse")){
                System.out.println("Du kan inte spela med det.");
                System.out.println("XXXXXXXX");
                System.out.println();
                System.out.println();
            }
            else {
                int slump = (int) (Math.random()*3);

                String motVal = "";
                if (slump == 0){
                    motVal = "sten";
                }else  if (slump == 1){
                    motVal = "sax";
                }else {
                    motVal = "påse";
                }
                System.out.println("Motståndarens val är: " + motVal);
                System.out.println("");
                System.out.println("");
                System.out.println("");

                if (mittVal.equals(motVal)){
                    System.out.println("Ni valde samma!!");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("");
                    System.out.println("");
                }else  if (mittVal.equals("sten") && motVal.equals("sax") || mittVal.equals("sax") && motVal.equals("påse") || mittVal.equals("påse") && motVal.equals("sten")) {
                    System.out.println("GRATTIS, DU VANN!!!");
                    System.out.println("**********");
                    System.out.println("*********");
                    System.out.println("");
                    System.out.println("");
                } else {
                    System.out.println("Ledsen men du förlorade :( :( :( ");
                }

            }


        }
        System.out.println("////////");
        System.out.println("//////");
        System.out.println("////");
        System.out.println("///");
        System.out.println("//");
        System.out.println("/");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Tack för att du spelade.");

    }




}
