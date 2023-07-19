package com.vzap;

public class Player {
    private String name;
    private int score;

    public Player(String name) throws PlayerException {
        if (name.trim().isEmpty()) {
            throw new PlayerException("the player name cant be empty");
        }
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addToScore(int p) throws PlayerException {
        int newScore = this.score + p;
        if (newScore < 0) {
            throw new PlayerException("the score cant be negative");
        }
        this.score = newScore;
    }
}