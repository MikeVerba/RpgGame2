package com.company.characters;

import com.company.items.Weapon;

public class Goblin extends Monster {
    public Goblin() {
        super("Goblin", 10, 2, new Weapon("sword", 3), "Goblin Head");
    }
}
