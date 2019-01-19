package com.company.locations;

import com.company.characters.Monster;
import com.company.utils.Descriptions;
import com.company.characters.Dragon;
import com.company.managers.MonsterFactory;
import com.company.utils.Directions;
import com.company.utils.Position;

import java.util.ArrayList;

public class DragonCave extends Location implements HasFightableMonsters {
    private MonsterFactory monsterFactory;
    private Dragon dragon;

    public DragonCave() {
        monsterFactory = new MonsterFactory();
        dragon = monsterFactory.createDragon();
        description = Descriptions.dragonCave;
        position = new Position(1, 0);
        directions = new ArrayList<>();
        directions.add(Directions.NORTH);
        hasMonster = true;


    }


    @Override
    public String toString() {
        return "You enter the dragon cave location.\n*****************************\n\n" +
                " description='" + description + '\'' + "Directions: " + this.directions +
                "\nYou are attacked by a dragon!!\n*****************************\n" + dragon +
                "\n\n\n";
    }

    @Override
    public Monster getMonster() {
        return dragon;
    }
}

