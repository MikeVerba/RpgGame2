package com.company.characters;

import com.company.items.MonsterHead;
import com.company.items.Weapon;

import java.util.ArrayList;

public abstract class Monster extends GameCharacter {
    MonsterHead monsterHead;

    public Monster(String name, int hitPoints, int attack, Weapon weapon, String headName) {
        this.monsterHead = new MonsterHead(headName);
        super.name = name;
        super.hitPoints = hitPoints;
        super.attack = attack;
        super.weapon = weapon;
        super.inventory = new ArrayList<>();
        inventory.add(monsterHead);
        inventory.add(weapon);
        isAlive = true;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "isAlive=" + isAlive +
                ", name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", attack=" + attack +
                ", weapon=" + weapon +
                ", inventory=" + inventory +
                '}';
    }
}
