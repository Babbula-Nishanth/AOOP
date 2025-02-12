package com.factory;

public class Game {
   private static Game instance;
   private GameElementFactory levelFactory;
   
   private Game() {
	   
   }
   public static synchronized Game getInstance() {
       if (instance == null) {
           instance = new Game();
       }
       return instance;
   }

   public void setLevelFactory(GameElementFactory factory) {
       this.levelFactory = factory;
   }

   public void play() {
       if (levelFactory == null) {
           throw new IllegalStateException("Game level factory is not set.");
       }

       Enemy enemy = levelFactory.createEnemy();
       Weapon weapon = levelFactory.createWeapon();
       PowerUp powerUp = levelFactory.createPowerUp();

       enemy.attack();
       weapon.use();
       powerUp.activate();
   }
}
