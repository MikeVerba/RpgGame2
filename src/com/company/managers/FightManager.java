package com.company.managers;

import com.company.characters.GameCharacter;
import com.company.characters.Monster;
import com.company.characters.Player;
import com.company.locations.HasFightableMonsters;
import com.company.utils.Printer;
import com.company.utils.RandomGenerator;

public class FightManager<T extends HasFightableMonsters> {
    private Player player;
    private Monster monster;
    private RandomGenerator randomGenerator;
    private World world;
    private T fightableLocation;
    private Printer printer;

    public FightManager(Player player, World world) {
        this.player = player;
        this.world = world;
        this.printer = new Printer();
        randomGenerator = new RandomGenerator();
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public Monster getMonster() {
        return monster;
    }

    public int countCharacterDamage(GameCharacter gameCharacter) {
        int totalDamage = gameCharacter.getAttack() +
                gameCharacter.getWeapon().getAttackBonus() +
                randomGenerator.generateRandomNumberBound10();
        printer.print(gameCharacter.getName() + " does damage:");
        printer.print(String.valueOf(totalDamage));
        return totalDamage;
    }

    public void recieveDamage(GameCharacter gameCharacter, int damage) {
        gameCharacter.setHitPoints(gameCharacter.getHitPoints() - damage);
    }

    public GameCharacter findWinner() {
        if (!player.isAlive && monster.isAlive) return monster;
        if (player.isAlive && !monster.isAlive) return player;
        else return null;
    }

    public void performOneRound() {


        recieveDamage(this.monster, countCharacterDamage(this.player));
        recieveDamage(this.player, countCharacterDamage(this.monster));
        findWinner();
    }

    public void performWholeFightingSequence() {

        fightableLocation = (T) world.getActualLocation();

        setMonster(fightableLocation.getMonster());


        while (monster.isAlive && player.isAlive) {
            printer.print(player.toString());
            printer.print(monster.toString());
            performOneRound();
            this.monster.aliveCheck();
            this.player.aliveCheck();

        }

    }
}
