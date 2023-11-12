package org.example;

import java.util.ArrayList;
import java.util.List;

public class Factory {
    public static Player[] playerArrayGenerator(String playerSource) {
        String[] playersStringArray = playerSource.split("#");
        Player[] returnArray        = new Player[playersStringArray.length];

        for (int i = 0; i < playersStringArray.length; i++) {
            String[] onePlayersDetails = playersStringArray[i].split("-");
            //Claudio Bravo     33      0       kapus       false
            //0                 1       2       3           4

            String name         = onePlayersDetails[0];
            String age          = onePlayersDetails[1];
            Integer goalCount   = Integer.parseInt(onePlayersDetails[2]);
            String position     = onePlayersDetails[3];
            Boolean captain     = Boolean.valueOf(onePlayersDetails[4]);

            returnArray[i] = new Player(name,age,goalCount,position,captain);
        }
        return returnArray;
    }
    
    public static void playerArrayGenerator2input(Player[] players, String playerSource) {
        String[] playersStringArray = playerSource.split("#");
        //Player[] players                     = new Player[playersStringArray.length];
        
        for (int i = 0; i < playersStringArray.length; i++) {
            String[] onePlayersDetails = playersStringArray[i].split("-");
            //Claudio Bravo     33      0       kapus       false
            //0                 1       2       3           4
            
            String name         = onePlayersDetails[0];
            String age          = onePlayersDetails[1];
            Integer goalCount   = Integer.parseInt(onePlayersDetails[2]);
            String position     = onePlayersDetails[3];
            Boolean captain     = Boolean.valueOf(onePlayersDetails[4]);
            
            players[i] = new Player(name,age,goalCount,position,captain);
        }
    }

    public static Team[] teamArrayGenerator(String teamSource) {
        String[] teamsStringArray   = teamSource.split("\\?");
        Team[] returnArray          = new Team[teamsStringArray.length];

        for (int i = 0; i < teamsStringArray.length; i++) {
            String[] oneTeamDetails = teamsStringArray[i].split("-");
            //FC Barcelona      BAR     1899
            //0                 1       2

            String name                 = oneTeamDetails[0];
            String shortName            = oneTeamDetails[1];
            Integer yearsOfFoundation   = Integer.parseInt(oneTeamDetails[2]);
            List<Player> players        = new ArrayList<>();

            returnArray[i] = new Team(name,shortName,yearsOfFoundation,players);
        }
        return returnArray;
    }
    
    public static void teamArrayGenerator2input(Team[] teams,String teamSource) {
        String[] teamsStringArray   = teamSource.split("\\?");
        //teams                       = new Team[teamsStringArray.length];
        
        for (int i = 0; i < teamsStringArray.length; i++) {
            String[] oneTeamDetails = teamsStringArray[i].split("-");
            //FC Barcelona      BAR     1899
            //0                 1       2
            
            String name                 = oneTeamDetails[0];
            String shortName            = oneTeamDetails[1];
            Integer yearsOfFoundation   = Integer.parseInt(oneTeamDetails[2]);
            List<Player> players        = new ArrayList<>();
            
            teams[i] = new Team(name,shortName,yearsOfFoundation,players);
        }
    }
    
    public static void connectPlayersWithTeams(Player[] players, Team[] teams) {
        int teamSize    = 8;
        int startIndex  = 0;
        
        for (int i = 0; i < teams.length; i++) {
            List<Player> currentTeamsPlayerList = teams[i].getPlayersList();
            
            for (int j = startIndex; j < startIndex + teamSize; j++) {
                currentTeamsPlayerList.add(players[j]);
            }
            startIndex = startIndex + teamSize;
        }
    }
    

    
    
    

}
