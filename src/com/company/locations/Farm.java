package com.company.locations;

import com.company.characters.NonPlayerCharacter;
import com.company.characters.Shaman;
import com.company.utils.Descriptions;
import com.company.utils.Directions;
import com.company.utils.Position;

import java.util.ArrayList;

public class Farm extends Location implements HasNonPlayerCharacter {

    Shaman shaman;


    public Farm() {
        enteringDescription = Descriptions.farmEnter;
        description = Descriptions.farm;
        position = new Position(2, 1);
        directions = new ArrayList<>();
        directions.add(Directions.WEST);
        hasMonster = false;
        hasNonPlayerCharacter = true;
        this.shaman = new Shaman();
    }

    @Override
    public String toString() {
        return enteringDescription + "\n*****************************\n\n" +
                " description='" + description + "Directions: " + this.directions + "\nYou encounter the shaman!\n*****************************\n" + shaman +
                "\n\n\n";

    }

    @Override
    public NonPlayerCharacter getNonPlayerCharacter() {
        return shaman;
    }
}
