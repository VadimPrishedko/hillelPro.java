import dto.Player;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import service.FilesDir;
import service.Game;

import java.io.IOException;
import java.util.Locale;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.Scanner;

public class RunGame {

    private static final Logger loggerDebug = LoggerFactory.getLogger("logger.debug");
//    private static final Logger loggerResult = LoggerFactory.getLogger("logger.result");

    public static void main(String[] args) throws IOException {


        Locale locale = Locale.getDefault();
        if (args.length == 1){
            locale = new Locale(args[0]);

        }

        ResourceBundle rb = ResourceBundle.getBundle("demo", locale);



        int handPlayer = 0;
        int count = 0;
        Scanner cs = new Scanner(System.in);
        FilesDir file = new FilesDir("result.txt");
        file.addFile();
        Game game = new Game();
        System.out.println(rb.getString("hello"));

//        loggerDebug.debug("Game Rock-Scissors-Paper");
        System.out.println(rb.getString("name"));
//        System.out.println("Enter your name: ");
        String name = cs.next();
//        loggerResult.debug("Клієнт " + name + " зайшов в гру");
        boolean scanInt = false;
        do {
            System.out.println(rb.getString("game"));
//            System.out.println("Desired number of games: ");
            scanInt = false;
            try {
                Scanner scan = new Scanner(System.in);
                count = scan.nextInt();
//                loggerResult.debug("Клієнт вибрал " + count + " ігр");

            } catch (Exception e) {
//                loggerResult.debug("Запит перезапущений, некоректна кількість");
//                System.out.println("Enter number");

                System.out.println(rb.getString("number"));

                scanInt = true;
            }
        } while (scanInt);

        Player player = new Player(name, count);

        int iter = 0;
        String playNext = "Y";
        do {


            do {
                System.out.println(rb.getString("choice"));
//                System.out.println("Choose a number where:\n" +
//                        "1 - Rock\n" +
//                        "2 - Scissors\n" +
//                        "3 - Paper\n");
                scanInt = false;
                try {
                    Scanner scan = new Scanner(System.in);
                    handPlayer = scan.nextInt();
                    if (handPlayer < 1 || handPlayer > 3) {
                        System.out.println("Enter 1 to 3");
                        scanInt = true;
                    }
                } catch (Exception e) {
                    System.out.println(rb.getString("enter"));
//                    System.out.println("Enter 1 to 3");
                    scanInt = true;
                }
            } while (scanInt);

            iter++;

            String str = "Game " + iter + "\n" + game.gamePay(handPlayer, player.getName());
//            loggerResult.debug(str);

            file.writeToFile(file.getFile(), str);
            loggerDebug.debug(str);
            if (iter != player.getCount()) {
                String strTemp = "played " + iter + " out of " + count;
//                loggerResult.debug(strTemp);
                loggerDebug.debug(strTemp + "\n" + "stop the game? \n enter Y or N");

                playNext = cs.next();
                if (Objects.equals(playNext, "N")) {
                    break;
                }
            }

        } while (player.getCount() != iter);

//        System.out.println(file.toString());
//        loggerResult.debug("Клієнт закінчив гру");
        System.out.println(rb.getString("end"));


//        file.deleteContent(); // content removal


//        loggerResult.debug("===============================================");
//        loggerResult.debug("Игровая статистика для игрока: " + player.getName());
//        loggerResult.debug("Перемог гравця: " + game.getPlayerCounter());
//        loggerResult.debug("Програно компютеру: " + game.getComputerCounter());
//        loggerResult.debug("===============================================");


//        loggerDebug.debug("===============================================");
//        loggerDebug.debug("Игровая статистика для игрока: " + player.getName());
//        loggerDebug.debug("Перемог гравця: " + game.getPlayerCounter());
//        loggerDebug.debug("Програно компютеру: " + game.getComputerCounter());
//        loggerDebug.debug("===============================================");

    }
}
