package hard.characters;

public abstract class Character implements Hero {
    private String name;
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


