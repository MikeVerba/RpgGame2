package com.company.locations;

import com.company.characters.King;
import com.company.characters.NonPlayerCharacter;
import com.company.utils.Descriptions;
import com.company.utils.Directions;
import com.company.utils.Position;

import java.util.ArrayList;

public class ThroneHall extends Location implements HasNonPlayerCharacter {
    King king;

    public ThroneHall() {
        enteringDescription = Descriptions.throneHallEnter;
        description = Descriptions.throneHall;
        position = new Position(0, 2);
        directions = new ArrayList<>();
        directions.add(Directions.EAST);
        hasMonster = false;
        hasNonPlayerCharacter = true;
        king = new King();


    }

    @Override
    public String toString() {
        return enteringDescription + "\n*****************************\n\n" +
                " description='" + description + "Directions: " + this.directions + "\nYou encounter the king!\n*****************************\n" + king +
                "\n\n\n";
    }

    @Override
    public NonPlayerCharacter getNonPlayerCharacter() {
        return king;

    }
}
