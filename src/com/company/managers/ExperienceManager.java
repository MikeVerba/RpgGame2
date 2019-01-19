package com.company.managers;

import com.company.characters.Player;
import com.company.items.MonsterHead;


public class ExperienceManager {
    private Player player;

    public ExperienceManager(Player player) {
        this.player = player;
    }

    public void levelUp() {

        if (player.hasGoblinHead()) {

            player.setHitPoints(player.getHitPoints() + 10);
            player.setAttack(player.getAttack() + 5);
            player.getInventory().remove(new MonsterHead("Goblin Head"));

        } else if (player.hasOrcHead()) {

            player.setHitPoints(player.getHitPoints() + 20);
            player.setAttack(player.getAttack() + 7);
            player.getInventory().remove(new MonsterHead("Orc Head"));

        } else if (player.hasTrollHead()) {

            player.setHitPoints(player.getHitPoints() + 30);
            player.setAttack(player.getAttack() + 10);
            player.getInventory().remove(new MonsterHead("Troll Head"));

        }
    }

}
