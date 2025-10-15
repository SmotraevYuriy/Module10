package hard;

import hard.characters.Character;
import hard.weapons.Weapons;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private Character[] heroes;
    private Character[] villains;
    private Weapons[] weapons;
    private boolean playerWin;
    private boolean compWin;
    private int heroIndex;
    private int villainIndex;
    private int heroWeapon;
    private int villainWeapon;


    public Game(Character[] heroes, Character[] villains, Weapons[] weapons) {
        this.heroes = heroes;
        this.villains = villains;
        this.weapons = weapons;
    }

    public int heroChoose() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < heroes.length; i++) {
            int j = i + 1;
            System.out.println(j + ". " + heroes[i].getName());
        }
        System.out.println("Выберите персонажа из списка. Для выбора введите его номер");
        heroIndex = scanner.nextInt();
        while (heroIndex != 1 && heroIndex != 2 && heroIndex != 3) {
            System.out.println("Введите корректное число");
            heroIndex = scanner.nextInt();
        }
        System.out.println("Вы выбрали " + heroes[heroIndex - 1].getName());
        return heroIndex;
    }

    public int weaponChoose() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < weapons.length; i++) {
            int j = i + 1;
            System.out.println(j + ". " + weapons[i].getName());
        }
        System.out.println("Выберите оружие. Для выбора введите его номер");
        heroWeapon = scanner.nextInt();
        while (heroWeapon != 1 && heroWeapon != 2 && heroWeapon != 3) {
            System.out.println("Введите корректное число");
            heroWeapon = scanner.nextInt();
        }
        heroWeapon = heroWeapon - 1;
        System.out.println("Вы выбрали " + weapons[heroWeapon].getName());
        return heroWeapon;
    }

    public int villainChoose() {
        villainIndex = new Random().nextInt(3);
        System.out.print("Против вас играет " + villains[villainIndex].getName());
        return villainIndex;
    }

    public int villainWeaponChoose() {
        villainWeapon = new Random().nextInt(3);
        System.out.println(". Оружие: " + weapons[villainWeapon].getName());
        return villainWeapon;
    }

    public boolean playerMove(int heroWeapon, int villainIndex, boolean playerWin) {
        Scanner scanner = new Scanner(System.in);
        int damage;
        int health;
        System.out.println("Чтобы сделать ход нажмите Enter");
        scanner.nextLine();
        int a = new Random().nextInt(2);
        if (a == 1) {
            damage = weapons[heroWeapon].doDamage();
            health = villains[villainIndex].getDamage(damage);
            villains[villainIndex].setHealth(health);
            System.out.println(heroes[heroIndex - 1].getName() + " попал и нанес урон: " + damage +
                    " единиц оружием " + weapons[heroWeapon].getName() + ". Осталось жизней у злодея: " + health);
            if (health <= 0) {
                playerWin = true;
            }
        }
        else {
            System.out.println(heroes[heroIndex - 1].getName() +  " промахнулся");
        }
        return playerWin;
    }

    public boolean compMove(int heroIndex, int villainWeapon, boolean compWin) {
        int damage;
        int health;
        System.out.println("Ход злодея.");
        int a = new Random().nextInt(2);
        if (a == 1) {
            damage = weapons[villainWeapon].doDamage();
            health = heroes[heroIndex - 1].getDamage(damage);
            heroes[heroIndex - 1].setHealth(health);
            System.out.println(villains[villainIndex].getName() + " попали и нанесли урон: " + damage +
                    " единиц оружием " + weapons[villainWeapon].getName() + ". Осталось жизней у героя: " + health);
            if (health <= 0) {
                compWin = true;
            }
        } else {
            System.out.println(villains[villainIndex].getName() +  " промахнулся");
        }
        return compWin;
    }


}
