package com.company.characters;

import com.company.items.Weapon;

import java.util.ArrayList;

public abstract class NonPlayerCharacter extends GameCharacter {

    public NonPlayerCharacter(String name, int hitPoints, int attack, Weapon weapon) {
        super.name = name;
        super.hitPoints = hitPoints;
        super.attack = attack;
        super.weapon = weapon;
        super.inventory = new ArrayList<>();
        inventory.add(weapon);
    }

    abstract public void performActionOnPlayer(Player player);

    @Override
    public String toString() {
        return "NPC{" +
                "isAlive=" + isAlive +
                ", name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", attack=" + attack +
                ", weapon=" + weapon +
                ", inventory=" + inventory +
                '}';
    }

    abstract public String getActionDescription();

}
