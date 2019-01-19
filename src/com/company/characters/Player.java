package com.company.characters;

import com.company.items.MonsterHead;
import com.company.items.Weapon;
import com.company.utils.Position;

import java.util.ArrayList;

public class Player extends GameCharacter {
    Position position;

    public Player(String name) {
        super.name = name;
        super.hitPoints = 50;
        super.attack = 10;
        weapon = new Weapon("knife", 3);
        super.inventory = new ArrayList<>();
        super.isAlive = true;
        position = new Position(1, 1);
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public boolean hasGoblinHead() {
        return inventory.contains(new MonsterHead("Goblin Head"));
    }

    public boolean hasOrcHead() {
        return inventory.contains(new MonsterHead("Orc Head"));
    }

    public boolean hasTrollHead() {
        return inventory.contains(new MonsterHead("Troll Head"));
    }

    public boolean hasDragonHead() {
        return inventory.contains(new MonsterHead("Dragon Head"));
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Player{" +
                "isAlive=" + isAlive +
                ", name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", attack=" + attack +
                ", weapon=" + weapon +
                ", inventory=" + inventory +
                '}';
    }
}
