package org.example;

import java.util.ArrayList;
import java.util.List;

public class Logic {
    
    public static Player youngestPlayer(Player[] players) {
        int youngestPlayerIndex = -1;
        int youngestPlayerAge   = Integer.MAX_VALUE;
        
        for (int i = 0; i < players.length; i++) {
            Player currentPlayer = players[i];
            int currentAge = Integer.parseInt(currentPlayer.getAge());
            if (currentAge < youngestPlayerAge) {
                youngestPlayerIndex = i;
                youngestPlayerAge = Integer.parseInt(currentPlayer.getAge());
            }
        }
        Player returnPlayer = players[youngestPlayerIndex];
        return returnPlayer;
    }
    
    public static Team oldestTeam(Team[] teams) {
        int oldestTeamIndex = -1;
        int oldestTeamYear  = Integer.MAX_VALUE;
        
        for (int i = 0; i < teams.length; i++) {
            Team currentTeam = teams[i];
            int currentYear = currentTeam.getYearsOfFoundation();
            if (currentYear < oldestTeamYear) {
                oldestTeamIndex = i;
                oldestTeamYear  = currentYear;
            }
        }
        Team returnTeam = teams[oldestTeamIndex];
        return returnTeam;
    }
    
    public static Integer topScorer(Player[] players) {
        //Inkabb topScore nak kellene nevezni, nem a jatekost adjuk vissza, hanem a legmagasabb gol szamot.
        //int topScorersIndex = -1;
        int highestGoal     = -1;
        
        for (int i = 0; i < players.length; i++) {
            Player currentPlayer    = players[i];
            int currentGoalNumber   = currentPlayer.getGoalCount();
            
            if (highestGoal < currentGoalNumber) {
                //topScorersIndex = i;
                highestGoal     = currentGoalNumber;
            }
        }
        return highestGoal;
    }
    
    public static String[] teamsGoalCount(Team[] teams) {
        String[] returnStringArray = new String[teams.length];
        
        for (int i = 0; i < teams.length; i++) {
            Team currentTeam            = teams[i];
            int currentTeamsGoalCount   = 0;
            
            for (int j = 0; j < currentTeam.getPlayersList().size(); j++) {
                Player currentPlayer        = currentTeam.getPlayersList().get(j);
                Integer currentPlayersGoals = currentPlayer.getGoalCount();
                
                currentTeamsGoalCount = currentTeamsGoalCount + currentPlayersGoals;
            }
            returnStringArray[i] = currentTeam.getName() + " - " + currentTeamsGoalCount;
        }
        return returnStringArray;
    }
    
    public static Player[] captains(Player[] players) {
        List<Player> captainsList = new ArrayList<>();
        
        for (int i = 0; i < players.length; i++) {
            Player currentPlayer = players[i];
            if (currentPlayer.getIsCaptain()) {
                captainsList.add(currentPlayer);
            }
        }
        Player[] returnStringArray  = new Player[captainsList.size()];
        for (int i = 0; i < captainsList.size(); i++) {
            returnStringArray[i] = captainsList.get(i);
        }
        return returnStringArray;
    }
    
    public static Player[] captainsV2(Player[] players) {
        Integer captainCount = 0;
        for (int i = 0; i < players.length; i++) {
            if (players[i].getIsCaptain()) {
                captainCount++;
            }
        }
        Integer captainArrayIndex = 0;
        Player[] returnStringArray  = new Player[captainCount];
        for (int i = 0; i < players.length; i++) {
            if (players[i].getIsCaptain()) {
                returnStringArray[captainArrayIndex] = players[i];
                captainArrayIndex++;
            }
        }
        return returnStringArray;
    }
    
    public static Boolean lessThanTwenty(Team[] teams) {
        Boolean returnBoolean = false;
        String[] teamsGoalsString = Logic.teamsGoalCount(teams);
        
        for (int i = 0; i < teams.length; i++) {
            String[] splitted = teamsGoalsString[i].split(" - ");
            String teamsGoals = splitted[splitted.length-1];
            
            if (Integer.parseInt(teamsGoals) < 20) {
                returnBoolean = true;
            }
        }
        return returnBoolean;
    }
    
    public static void captainGoals(Player[] players) {
        Player[] captains = Logic.captains(players);
        
        for (int i = 0; i < captains.length; i++) {
            System.out.println(captains[i].getName() + ": " + captains[i].getGoalCount());
        }
    }
    
    public static void teamsOrderedByGoals(Team[] teams) {
        String[] teamsWithScore = Logic.teamsGoalCount(teams);
        //One element: FC Barcelona - 68
        
        for (int i = teamsWithScore.length; i > 1; i--) {
            for (int j = 0; j < i-1; j++) {
                String[] currentTeam   = teamsWithScore[j].split(" - ");
                int currentGoals   = Integer.parseInt(currentTeam[currentTeam.length-1]);   //j
                String[] nextTeam      = teamsWithScore[j+1].split(" - ");
                int nextGoals      = Integer.parseInt(nextTeam[nextTeam.length-1]);         //j+1
                
                if (currentGoals < nextGoals) {
                    //x[ i ] ↔ x [ j + 1 ]
                    String temp = teamsWithScore[j];
                    teamsWithScore[j] = teamsWithScore[j+1];
                    teamsWithScore[j+1] = temp;
                }
            }
        }
        
        for (int i = 0; i < teamsWithScore.length; i++) {
            System.out.println(teamsWithScore[i]);
        }
    }
    
    public static void listOfPlayerInTeam(Team[] teams, Integer teamIndex) {
        //A methodus elnevezes nem megfelelo, csapat adatokat is ad vissza.
    
    
//      Csapat neve: FC Barcelona
//      Rövidítése: FCB
//      Alapítás éve: 1899
//      Játékosok:
//      - Gipsz Jakab – 19 éves – Védő – 22 gól – csapatkapitány
//      - Kiss Tamás – 20 éves – Kapus – 0 gól
        
        Team chosenTeam = teams[teamIndex];
        
        System.out.println("Csapat neve: " + chosenTeam.getName());
        System.out.println("Rövidítése: " + chosenTeam.getShortName());
        System.out.println("Alapítás éve: " + chosenTeam.getYearsOfFoundation());
        System.out.println("Játékosok: ");
        
        for (int i = 0; i < chosenTeam.getPlayersList().size(); i++) {
            System.out.println(chosenTeam.getPlayersList().get(i).toString());
        }
    
    
    
    }
    
    
    
    
    
    
}
