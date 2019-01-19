package com.company.locations;

import com.company.utils.Directions;
import com.company.utils.Position;

import java.util.List;

public abstract class Location {
    Position position;
    protected String description;
    protected String enteringDescription;
    protected List<Directions> directions;
    protected boolean hasMonster;
    protected boolean hasNonPlayerCharacter;

    public List<Directions> getDirections() {
        return directions;
    }

    public boolean hasMonster() {
        return hasMonster;
    }

    public boolean hasNonPlayerCharacter() {
        return hasNonPlayerCharacter;
    }
}
