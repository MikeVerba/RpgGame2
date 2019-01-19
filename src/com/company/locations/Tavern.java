package com.company.locations;

import com.company.characters.Bartender;
import com.company.characters.NonPlayerCharacter;
import com.company.utils.Descriptions;
import com.company.utils.Directions;
import com.company.utils.Position;

import java.util.ArrayList;

public class Tavern extends Location implements HasNonPlayerCharacter {
    Bartender bartender;


    public Tavern() {
        enteringDescription = Descriptions.tavernEnter;
        description = Descriptions.tavern;
        position = new Position(2,2);
        directions = new ArrayList<>();
        directions.add(Directions.WEST);
        hasMonster = false;
        hasNonPlayerCharacter = true;
        bartender = new Bartender();
    }

    @Override
    public String toString() {
        return enteringDescription+ "\n*****************************\n\n" +
                " description='" + description + "Directions: "+this.directions + "\nYou encounter bartender!\n*****************************\n" + bartender +
                "\n\n\n";

    }

    @Override
    public NonPlayerCharacter getNonPlayerCharacter() {
        return bartender;

    }
}