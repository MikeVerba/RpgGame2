package com.company.locations;

import com.company.utils.Descriptions;
import com.company.characters.Monster;
import com.company.managers.MonsterFactory;
import com.company.utils.Directions;
import com.company.utils.Position;

import java.util.ArrayList;

public class Dungeon extends Location implements HasFightableMonsters {
    private MonsterFactory monsterFactory;
    private Monster monster;

    public Dungeon() {
        monsterFactory = new MonsterFactory();
        description = Descriptions.dungeon;
        enteringDescription = Descriptions.dungeonEnter;
        position = new Position(0, 1);
        directions = new ArrayList<>();
        directions.add(Directions.EAST);
        hasMonster = true;

    }

    @Override
    public String toString() {
        return enteringDescription + "\n*****************************\n\n" +
                " description='" + description + '\'' + "Directions: " + this.directions +
                "\nYou are attacked by a monster!!\n*****************************\n" + monster +
                "\n\n\n";
    }

    @Override
    public Monster getMonster() {
        monster = monsterFactory.createRandomMonster();
        return monster;
    }
}
