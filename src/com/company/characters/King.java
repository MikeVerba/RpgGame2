package com.company.characters;

import com.company.items.Weapon;
import com.company.managers.ExperienceManager;
import com.company.utils.Descriptions;

public class King extends NonPlayerCharacter {

    private String actionDescription = Descriptions.kingActionDescription;
    ExperienceManager experienceManager;

    public King() {
        super("Sigfried", 200, 50, new Weapon("Grayswandir", 30));

    }


    @Override
    public void performActionOnPlayer(Player player) {
        experienceManager = new ExperienceManager(player);
        experienceManager.levelUp();
    }

    @Override
    public String getActionDescription() {
        return actionDescription;
    }
}
