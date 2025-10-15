package hard;

import hard.characters.*;
import hard.characters.Character;
import hard.weapons.Bow;
import hard.weapons.Spear;
import hard.weapons.Sword;
import hard.weapons.Weapons;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int heroIndex;
        int villainIndex;
        int heroWeapon;
        int villainWeapon;
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
        Weapons bow = new Bow();
        Weapons sword = new Sword();
        Weapons spear = new Spear();
        Weapons[] weapons = {bow, sword, spear};
        Character[] heroes = {hero1, hero2, hero3};
        Character[] villains = {villain1, villain2, villain3};

        Game game = new Game(heroes, villains, weapons);

        while (replay.equals("да")) {
            heroIndex = game.heroChoose();
            heroWeapon = game.weaponChoose();
            villainIndex = game.villainChoose();
            villainWeapon = game.villainWeaponChoose();
            playerWin = false;
            compWin = false;
            while (true) {
                playerWin = game.playerMove(heroWeapon, villainIndex, playerWin);
                compWin = game.compMove(heroIndex, villainWeapon, compWin);
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
