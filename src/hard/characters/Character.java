package hard.characters;

import hard.Hero;
import hard.Weapon;

public abstract class Character implements Hero, Weapon {
    private String name;
    private String weapon;
    private int health;
    private int damage;

    public Character(String name, int damage, String weapon, int health) {
        this.name = name;
        this.damage = damage;
        this.weapon = weapon;
        this.health = health;
    }

    @Override
    public int getDamage(int damage) {
        health = health - damage;
        return health;
    }

    @Override
    public int doDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}


