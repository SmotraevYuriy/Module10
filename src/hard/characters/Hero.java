package hard.characters;

import hard.weapons.Weapons;

public interface Hero {
    int getDamage(int damage);
    String getName();
    int getHealth();
    void setHealth(int health);
    int doDamage();
    void setWeapon(Weapons weapons);
}
