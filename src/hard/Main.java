package hard;

import hard.characters.*;
import hard.characters.Character;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int heroIndex;
        int villainIndex;
        boolean playerWin = false;
        boolean compWin = false;
        String replay = "да";

        Scanner scanner = new Scanner(System.in);

        Character hero1 = new Hero1();
        Character hero2 = new Hero2();
        Character hero3 = new Hero3();
        Character villain1 = new Villain1();
        Character villain2 = new Villain2();
        Character villain3 = new Villain3();
        Character[] heroes = {hero1, hero2, hero3};
        Character[] villains = {villain1, villain2, villain3};

        Game game = new Game(heroes, villains);

        while (replay.equals("да")) {
            heroIndex = game.heroChoose();
            villainIndex = game.villainChoose();
            playerWin = false;
            compWin = false;
            while (true) {
                playerWin = game.playerMove(heroIndex, villainIndex, playerWin);
                compWin = game.compMove(heroIndex, villainIndex, compWin);
                if (playerWin && !compWin) {
                    System.out.println("Вы победили");
                    break;
                } else if (compWin && !playerWin) {
                    System.out.println("Компьютер победил");
                    break;
                } else if (playerWin && compWin) {
                    System.out.println("Ничья");
                    break;
                }
            }
            System.out.println("Желаете повторить игру? (да/нет)");
            replay = scanner.next();
            while (!replay.equals("да") && !replay.equals("нет")) {
                System.out.println("Введите корректный ответ");
                replay = scanner.next();
            }
            if (replay.equals("да")) {
                heroes[heroIndex - 1].setHealth(100);
                villains[villainIndex].setHealth(100);
            }
        }

    }
}
