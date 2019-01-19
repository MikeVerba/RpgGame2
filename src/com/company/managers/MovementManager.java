package com.company.managers;

import com.company.characters.Player;
import com.company.locations.DragonCave;
import com.company.locations.Dungeon;
import com.company.locations.Location;
import com.company.utils.Directions;
import com.company.utils.Position;

import java.util.ArrayList;

public class MovementManager {

    Player player;
    World world;

    public MovementManager(Player player, World world) {
        this.player = player;
        this.world = world;

    }

    public void moveEast() {
        player.setPosition(new Position(player.getPosition().getX() + 1, player.getPosition().getY()));
    }

    public void moveWest() {
        player.setPosition(new Position(player.getPosition().getX() - 1, player.getPosition().getY()));
    }

    public void moveNorth() {
        player.setPosition(new Position(player.getPosition().getX(), player.getPosition().getY() + 1));
    }

    public void moveSouth() {
        player.setPosition(new Position(player.getPosition().getX(), player.getPosition().getY() - 1));
    }

    public Player getPlayer() {
        return player;
    }

    public World getWorld() {
        return world;
    }

    public Position getPlayerPosition() {
        return player.getPosition();
    }


}
