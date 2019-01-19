package com.company.characters;

import com.company.items.Weapon;

public class Orc extends Monster {
    public Orc() {
        super("Orc", 30, 3, new Weapon("sword", 4), "Orc Head");
    }
}
