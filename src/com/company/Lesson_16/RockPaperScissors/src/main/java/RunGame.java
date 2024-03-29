import dto.Player;
import service.FilesDir;
import service.Game;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class RunGame {
    public static void main(String[] args) throws IOException {
        int handPlayer = 0;
        int count = 0;
        Scanner cs = new Scanner(System.in);
        FilesDir file = new FilesDir("result.txt");
        file.addFile();


        System.out.println("Game Rock-Scissors-Paper");
        System.out.println("Enter your name: ");
        String name = cs.next();
        boolean scanInt = false;
        do {
            System.out.println("Desired number of games: ");
            scanInt = false;
            try {
                Scanner scan = new Scanner(System.in);
                count = scan.nextInt();
            } catch (Exception e) {
                System.out.println("Enter number");
                scanInt = true;
            }
        } while (scanInt);

        Player player = new Player(name, count);

        int iter = 0;
        String playNext = "Y";
        do {


            do {
                System.out.println("Choose a number where:\n" +
                        "1 - Rock\n" +
                        "2 - Scissors\n" +
                        "3 - Paper\n");
                scanInt = false;
                try {
                    Scanner scan = new Scanner(System.in);
                    handPlayer = scan.nextInt();
                    if (handPlayer < 1 || handPlayer > 3) {
                        System.out.println("Enter 1 to 3");
                        scanInt = true;
                    }
                } catch (Exception e) {
                    System.out.println("Enter 1 to 3");
                    scanInt = true;
                }
            } while (scanInt);

            iter++;

            String str = "Game " + iter + "\n" + new Game().gamePay(handPlayer, player.getName());

            file.writeToFile(file.getFile(), str);

            System.out.println(str);

            if (iter != player.getCount()) {

                System.out.println("played " + iter + " out of " + count + "\n" +
                        "stop the game? \n enter Y or N"
                );

                playNext = cs.next();
                if (Objects.equals(playNext, "N")) {
                    break;
                }
            }

        } while (player.getCount() != iter);

        System.out.println(file.toString());
//        file.deleteContent(); // content removal
    }
}
