package com.company.managers;

import com.company.characters.Player;
import com.company.locations.*;
import com.company.utils.Position;
import java.util.HashMap;



public class World {
    private HashMap<Position, Location>locationHashMap;
    private ThroneHall throneHall;
    private Castle castle;
    private Tavern tavern;
    private Dungeon dungeon;
    private Forest forest;
    private Farm farm;
    private DragonCave dragonCave;
    private MovementManager movementManager;
    private MonsterFactory monsterFactory;
    Player player;



    public World(Player player){
        locationHashMap = new HashMap<>();
        this.throneHall = new ThroneHall();
        locationHashMap.put(new Position(0,2), throneHall);
        this.castle = new Castle();
        locationHashMap.put(new Position(1,2),castle);
        this.tavern = new Tavern();
        locationHashMap.put(new Position(2,2), tavern);
        this.dungeon = new Dungeon();
        locationHashMap.put(new Position(0,1), dungeon);
        this.forest = new Forest();
        locationHashMap.put(new Position(1,1), forest);
        this.farm = new Farm();
        locationHashMap.put(new Position(2,1), farm);
        this.dragonCave = new DragonCave();
        locationHashMap.put(new Position(1,0), dragonCave);
        this.player = player;
        this.monsterFactory = new MonsterFactory();
        this.movementManager = new MovementManager(player,this);


    }

    public HashMap<Position, Location> getLocationHashMap() {
        return locationHashMap;
    }
    public Location getActualLocation(){

    return this.getLocationHashMap().get(player.getPosition());
    }

    public MonsterFactory getMonsterFactory() {
        return monsterFactory;
    }

    public MovementManager getMovementManager() {
        return movementManager;
    }

    public DragonCave getDragonCave() {
        return dragonCave;
    }
}
