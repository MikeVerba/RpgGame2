package com.company.managers;

import com.company.characters.*;

import java.util.Random;

public class MonsterFactory {
    public Goblin createGoblin() {
        return new Goblin();
    }

    public Orc createOrc() {
        return new Orc();
    }

    public Troll createTroll() {
        return new Troll();
    }

    public Dragon createDragon() {
        return new Dragon();
    }

    public Monster createRandomMonster() {
        Monster monster;
        Random random = new Random();
        int choice = random.nextInt(3);
        System.out.println(choice);

        switch (choice) {
            case 0:
                monster = createGoblin();
                break;

            case 1:
                monster = createOrc();
                break;

            default:
                monster = createTroll();

        }
        return monster;

    }

}
