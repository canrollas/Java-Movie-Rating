package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Queue<MovieCritic> movieCritics = new ArrayDeque<>();
        Queue<GameCritic> gameCritics = new ArrayDeque<>();

        MovieCritic mvCritic1 = new MovieCritic(0.1);
        MovieCritic mvCritic2 = new MovieCritic(-0.2);
        MovieCritic mvCritic3 = new MovieCritic(+.3);

        movieCritics.add(mvCritic1);
        movieCritics.add(mvCritic2);
        movieCritics.add(mvCritic3);

        GameCritic gameCritic1 = new GameCritic(5);
        GameCritic gameCritic2 = new GameCritic(9);
        GameCritic gameCritic3 = new GameCritic(-3);
        GameCritic gameCritic4 =new GameCritic(2);
        GameCritic gameCritic5 = new GameCritic(-7);

        gameCritics.add(gameCritic1);
        gameCritics.add(gameCritic2);
        gameCritics.add(gameCritic3);
        gameCritics.add(gameCritic4);
        gameCritics.add(gameCritic5);


        FileIO data = new FileIO();
        Stack<Object> seconder = data.getContentStackSorted();


        while (!seconder.isEmpty()){
            if (seconder.peek() instanceof GameContentObjects){
                GameContentObjects gameContentObject = (GameContentObjects) seconder.pop();
                GameCritic critic = gameCritics.poll();
                assert critic != null;
                critic.setGameContentObjects(gameContentObject);
                System.out.println(gameContentObject);
                System.out.println(critic.calculateRating()+":Oyun");
                gameCritics.add(critic);
            }else {
                FilmContentObjects filmContentObjects = (FilmContentObjects) seconder.pop();
                MovieCritic critic = movieCritics.poll();
                assert critic != null;
                critic.setFilmContentObjects(filmContentObjects);
                System.out.println(filmContentObjects);
                System.out.println(critic.calculateRating()+":Film");
                movieCritics.add(critic);
            }
        }

    }
}
