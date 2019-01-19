package com.company.characters;


import com.company.items.Weapon;

public class Dragon extends Monster {

    public Dragon() {
        super("Dragon", 100, 20, new Weapon("dragon claw", 10), "Dragon Head");
    }
}
