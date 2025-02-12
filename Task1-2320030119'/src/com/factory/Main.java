package com.factory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = Game.getInstance();
		GameElementFactory easyLevelFactory = new EasyLevelFactory();
		game.setLevelFactory(easyLevelFactory);
		 game.play();
	        
	        System.out.println("------------");
	        GameElementFactory hardLevelFactory = new HardLevelFactory();
	        game.setLevelFactory(hardLevelFactory);
	        game.play();

	}

}
