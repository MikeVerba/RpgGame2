package com.company.locations;

import com.company.utils.Descriptions;
import com.company.utils.Directions;
import com.company.utils.Position;

import java.util.ArrayList;

public class Castle extends Location {

    public Castle() {
        enteringDescription = Descriptions.castleEnter;
        description = Descriptions.castle;
        position = new Position(1, 2);
        directions = new ArrayList<>();
        directions.add(Directions.SOUTH);
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
