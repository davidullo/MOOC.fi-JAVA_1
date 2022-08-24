/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author davba
 */
public class Team {
    private String name;
    private int playedGames;
    
    public Team (String name, int playedGames) {
        this.name = name;
        this.playedGames = playedGames;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getPlayedGames() {
        return this.playedGames;
    }
    
}
