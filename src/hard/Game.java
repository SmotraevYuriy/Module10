package hard;

import hard.characters.Character;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private Character[] heroes;
    private Character[] villains;
    private boolean playerWin;
    private boolean compWin;
    private int heroIndex;
    private int villainIndex;


    public Game(Character[] heroes, Character[] villains) {
        this.heroes = heroes;
        this.villains = villains;
    }

    public int heroChoose() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < heroes.length; i++) {
            int j = i + 1;
            System.out.println(j + ". " + heroes[i].getName() + ". Оружие: " + heroes[i].getWeapon());
        }
        System.out.println("Выберите персонажа из списка. Для выбора введите его номер");
        heroIndex = scanner.nextInt();
        while (heroIndex != 1 && heroIndex != 2 && heroIndex != 3) {
            System.out.println("Введите корректное число");
            heroIndex = scanner.nextInt();
        }
        System.out.println("Вы выбрали " + heroes[heroIndex - 1].getName() + ". Оружие: " + heroes[heroIndex - 1].getWeapon());
        return heroIndex;
    }

    public int villainChoose() {
        villainIndex = new Random().nextInt(3);
        System.out.println("Против вас играет " + villains[villainIndex].getName() + ". Оружие: " + villains[villainIndex].getWeapon());
        return villainIndex;
    }

    public boolean playerMove(int heroIndex, int villainIndex, boolean playerWin) {
        Scanner scanner = new Scanner(System.in);
        int damage;
        int health;
        System.out.println("Чтобы сделать ход нажмите Enter");
        scanner.nextLine();
        int a = new Random().nextInt(2);
        if (a == 1) {
            damage = heroes[heroIndex - 1].doDamage();
            health = villains[villainIndex].getDamage(damage);
            villains[villainIndex].setHealth(health);
            System.out.println(heroes[heroIndex - 1].getName() + " попал и нанес урон: " + damage +
                    " единиц оружием " + heroes[heroIndex - 1].getWeapon() + ". Осталось жизней у злодея: " + health);
            if (health <= 0) {
                playerWin = true;
            }
        }
        else {
            System.out.println(heroes[heroIndex - 1].getName() +  " промахнулся");
        }
        return playerWin;
    }

    public boolean compMove(int heroIndex, int villainIndex, boolean compWin) {
        int damage;
        int health;
        System.out.println("Ход злодея.");
        int a = new Random().nextInt(2);
        if (a == 1) {
            damage = villains[villainIndex].doDamage();
            health = heroes[heroIndex - 1].getDamage(damage);
            heroes[heroIndex - 1].setHealth(health);
            System.out.println(villains[villainIndex].getName() + " попали и нанесли урон: " + damage +
                    " единиц оружием " + villains[villainIndex].getWeapon() + ". Осталось жизней у героя: " + health);
            if (health <= 0) {
                compWin = true;
            }
        } else {
            System.out.println(villains[villainIndex].getName() +  " промахнулся");
        }
        return compWin;
    }


}
