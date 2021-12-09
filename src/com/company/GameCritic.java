package com.company;

public class GameCritic extends Critic{
    
    private GameContentObjects gameContentObjects;
    
    public GameCritic(double opinion){
        super(opinion);
    }

    public void setGameContentObjects(GameContentObjects gameContentObjects) {
        this.gameContentObjects = gameContentObjects;
    }

    @Override
    public double calculateRating(){
        if (gameContentObjects.getTypeInt()==1){
            return gameContentObjects.getRating() + ((10 - gameContentObjects.getHour()) * 0.25) + (super.opinion);

        }
        if (gameContentObjects.getTypeInt()==2){
            return gameContentObjects.getRating() + (gameContentObjects.getHour() * 0.25) + (super.opinion);
        }
        if (gameContentObjects.getTypeInt()==3){
            return gameContentObjects.getRating() + ((gameContentObjects.getHour() - 3) * 3) + (super.opinion);
        }
        else {
            return 0;
        }
    }

}
