package com.company.locations;

import com.company.utils.Descriptions;
import com.company.utils.Directions;
import com.company.utils.Position;

import java.util.ArrayList;

public class Forest extends Location {


    public Forest() {
        enteringDescription = Descriptions.forestEnter;
        description = Descriptions.forest;
        position = new Position(1, 1);
        directions = new ArrayList<>();
        directions.add(Directions.SOUTH);
        directions.add(Directions.NORTH);
        directions.add(Directions.EAST);
        directions.add(Directions.WEST);
        hasMonster = false;
    }

    @Override
    public String toString() {
        return enteringDescription + "\n*****************************\n\n" +
                " description='" + description + "Directions: " + this.directions;

    }
}