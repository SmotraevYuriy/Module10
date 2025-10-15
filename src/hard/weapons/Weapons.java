package hard.weapons;

public abstract class Weapons implements Weapon {
    private String name;
    private int damage;

    public Weapons(int damage, String name) {
        this.damage = damage;
        this.name = name;
    }

    @Override
    public int doDamage() {
        return damage;
    }

    @Override
    public String getName() {
        return name;
    }
}
