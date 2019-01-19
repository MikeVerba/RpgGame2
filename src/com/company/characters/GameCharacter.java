package com.company.characters;

import com.company.items.GameItem;
import com.company.items.Weapon;

import java.util.List;

public abstract class GameCharacter {
    public boolean isAlive;
    protected String name;
    protected int hitPoints;
    protected int attack;
    protected Weapon weapon;
    List<GameItem> inventory;

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public List<GameItem> getInventory() {
        return inventory;
    }

    public void aliveCheck() {
        if (hitPoints <= 0) {
            isAlive = false;
            System.out.println(name + " is dead");
        }
    }

}
