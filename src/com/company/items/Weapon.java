package com.company.items;

public class Weapon extends GameItem {

    private int attackBonus;

    public Weapon(String name, int attackBonus) {
        super(name);
        this.attackBonus = attackBonus;
    }

    public String getName() {
        return name;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "attackBonus=" + attackBonus +
                ", name='" + name + '\'' +
                '}';
    }
}
