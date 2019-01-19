package com.company.characters;


import com.company.items.Weapon;
import com.company.utils.Descriptions;


public class Shaman extends NonPlayerCharacter {
    private String actionDescription = Descriptions.shamanActionDescription;

    public Shaman() {
        super("Shaman", 100, 20, new Weapon("Staff", 10));
    }


    @Override
    public void performActionOnPlayer(Player player) {
        player.setHitPoints(player.getHitPoints() + 10);

    }

    @Override
    public String getActionDescription() {
        return actionDescription;
    }
}
