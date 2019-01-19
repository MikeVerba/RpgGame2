package com.company.managers;


import com.company.characters.Player;

import com.company.locations.HasNonPlayerCharacter;
import com.company.utils.Printer;

public class InteractionManager<T extends HasNonPlayerCharacter> {

    private Player player;
    private World world;
    private T interactionableLocation;
    private Printer printer;

    public InteractionManager(Player player, World world) {
        this.player = player;
        this.world = world;
        printer = new Printer();

    }

    public void performInteraction() {
        interactionableLocation = (T) world.getActualLocation();
        interactionableLocation.getNonPlayerCharacter().performActionOnPlayer(player);
        printer.print(interactionableLocation.getNonPlayerCharacter().getActionDescription());

    }
}
