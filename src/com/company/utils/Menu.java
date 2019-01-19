package com.company.utils;

import com.company.characters.Player;
import com.company.managers.FightManager;
import com.company.managers.InteractionManager;
import com.company.managers.World;

import java.util.Scanner;

public class Menu {

    private World world;
    private Player player;
    private Printer printer;
    private Descriptions descriptions;
    private Scanner scanner = new Scanner(System.in);
    private FightManager fightManager;
    private InteractionManager interactionManager;


    public Menu() {
        this.printer = new Printer();
        this.descriptions = new Descriptions();
        this.player = new Player("Astrin");
        this.world = new World(player);
        this.descriptions = new Descriptions();

    }

    public void performMainLoop() {
        while (player.isAlive && !hasPlayerWonTheGame()) {
            loadLocation();
        }
        if (hasPlayerWonTheGame()) {
            performWinSequence();
        }

    }

    public void loadFightingSequence() {
        this.fightManager = new FightManager(player, world);
        this.fightManager.performWholeFightingSequence();
        if (this.player.isAlive) {
            printer.print("You've recieved items:");
            printer.print(fightManager.getMonster().getInventory().toString());
            player.getInventory().addAll(fightManager.getMonster().getInventory());
            player.setWeapon(fightManager.getMonster().getWeapon());

            getPlayerChoice();
        } else {
            printer.print(Descriptions.gameOver);
        }


    }

    public void loadInteractionSequence() {
        this.interactionManager = new InteractionManager(player, world);
        interactionManager.performInteraction();

        getPlayerChoice();
    }

    public void loadLocation() {
        printer.print(world.getActualLocation().toString());
        if (world.getActualLocation().hasMonster()) {
            loadFightingSequence();
        }
        if (world.getActualLocation().hasNonPlayerCharacter()) {
            loadInteractionSequence();
        } else if (player.isAlive) {
            getPlayerChoice();
        }

    }

    private void performWinSequence() {
        printer.print(Descriptions.winSequenceDescription);
    }

    public void getPlayerChoice() {
        boolean subModuleIsRunning = true;
        if (hasPlayerWonTheGame()) {
            subModuleIsRunning = false;
        }

        while (subModuleIsRunning) {
            printer.print("Where you want to go: ");
            printer.print(descriptions.choiceOne + descriptions.movementDirectionNorth);
            printer.print(descriptions.choiceTwo + descriptions.movementDirectionSouth);
            printer.print(descriptions.choiceThree + descriptions.movementDirectionEast);
            printer.print(descriptions.choiceFour + descriptions.movementDirectionWest);
            printer.print(descriptions.choiceFive + descriptions.playerInfo);
            String choice = scanner.next();


            switch (choice) {

                case "1":
                    if (world.getActualLocation().getDirections().contains(Directions.NORTH)) {
                        world.getMovementManager().moveNorth();
                        subModuleIsRunning = false;
                    } else printer.print(Descriptions.invalidDirection);
                    break;
                case "2":
                    if (world.getActualLocation().getDirections().contains(Directions.SOUTH)) {
                        world.getMovementManager().moveSouth();
                        subModuleIsRunning = false;
                    } else printer.print(Descriptions.invalidDirection);
                    break;
                case "3":
                    if (world.getActualLocation().getDirections().contains(Directions.EAST)) {
                        world.getMovementManager().moveEast();
                        subModuleIsRunning = false;
                    } else printer.print(Descriptions.invalidDirection);
                    break;
                case "4":
                    if (world.getActualLocation().getDirections().contains(Directions.WEST)) {
                        world.getMovementManager().moveWest();
                        subModuleIsRunning = false;
                    } else printer.print(Descriptions.invalidDirection);
                    break;
                case "5":
                    printer.print(player.toString());
                    break;
                default:
                    printer.print(Descriptions.errorMessage);

            }
        }
    }

    public boolean hasPlayerWonTheGame() {

        return !world.getDragonCave().getMonster().isAlive;
    }

    public Player getPlayer() {
        return player;
    }
}
