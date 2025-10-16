package hard.characters;

import hard.weapons.Weapons;

public abstract class Character implements Hero {
    private String name;
    Weapons weapon;
    private int health;


    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    @Override
    public int getDamage(int damage) {
        health = health - damage;
        return health;
    }

    @Override
    public int doDamage() {
        return weapon.getDamage();
    }

    @Override
    public void setWeapon(Weapons weapons) {
        this.weapon = weapons;
    }

    public String getName() {
        return name;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}


