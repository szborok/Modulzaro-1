package org.example;

import java.util.List;

public class Team {

    private String name;
    private String shortName;
    private Integer yearsOfFoundation;
    private List<Player> players;

    public Team(String name, String shortName, Integer yearsOfFoundation, List<Player> players) {
        this.name = name;
        this.shortName = shortName;
        this.yearsOfFoundation = yearsOfFoundation;
        this.players = players;
    }

    public String getName() {return name;}
    public String getShortName() {return shortName;}
    public Integer getYearsOfFoundation() {return yearsOfFoundation;}
    public List<Player> getPlayersList() {return players;}
    
    public void addPlayerToTeam(Player newPlayer) {
        List<Player> currentList    = this.getPlayersList();
        int escapeNumber            = -1;
        
        for (int i = 0; i < currentList.size(); i++) {
            if (currentList.get(i) != null && escapeNumber == -1) {
                currentList.add(newPlayer);
                escapeNumber = 0;
            }
        }
        
        
        
        
    }



}
