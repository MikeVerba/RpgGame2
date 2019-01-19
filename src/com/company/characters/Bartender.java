package com.company.characters;

import com.company.items.Weapon;
import com.company.utils.Descriptions;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bartender extends NonPlayerCharacter {
    private String actionDescription;
    private String dragonInformation;
    private String dungeonInformation;
    private String shamanInformation;
    private String kingInformation;
    List<String> informationList;
    Random random;

    public Bartender() {
        super("Winthrop", 20, 3, new Weapon("Knife", 2));

        actionDescription = Descriptions.bartenderActionDescription;
        dragonInformation = Descriptions.bartenderDragonInformation;
        dungeonInformation = Descriptions.bartenderDungeonInformation;
        shamanInformation = Descriptions.bartenderShamanInformation;
        kingInformation = Descriptions.bartenderKingInformation;
        informationList = new ArrayList<>();
        informationList.add(dungeonInformation);
        informationList.add(dragonInformation);
        informationList.add(kingInformation);
        informationList.add(shamanInformation);
        random = new Random();
    }

    @Override
    public void performActionOnPlayer(Player player) {
        player.setHitPoints(player.getHitPoints() - 1);

    }

    @Override
    public String getActionDescription() {
        return actionDescription + informationList.get(random.nextInt(informationList.size()));
    }
}
