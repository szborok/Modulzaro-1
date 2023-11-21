package org.example;

import java.util.List;

public class PrintTest {
    
    public static void connectPlayersWithTeams(Player[] players, Team[] teams) {
        Factory.connectPlayersWithTeams(players,teams);
        
        for (int i = 0; i < teams.length; i++) {
            System.out.println(teams[i].getName() + "'s players: ");
            List<Player> currentTeamsPlayers = teams[i].getPlayersList();
            for (int j = 0; j < currentTeamsPlayers.size(); j++) {
                System.out.println(currentTeamsPlayers.get(j).getName());
            }
            //az utolso csapat jatekosai vegere ne tegyen "---"-t
            if (i != teams.length-1) {
                System.out.println("---");
            }
        }
    }
    
    public static void youngestPlayer(Player[] players) {
        Player youngestPlayer = Logic.youngestPlayer(players);
        
        System.out.println("The youngest players is " + youngestPlayer.getName() + ".");
    }
    
    public static void oldestTeam(Team[] teams) {
        Team oldestTeam = Logic.oldestTeam(teams);
        
        System.out.println("The oldest team is " + oldestTeam.getName() + ".");
    }
    
    public static void topScorer(Player[] players) {
        //Inkabb topScore nak kellene nevezni, nem a jatekost adjuk vissza, hanem a legmagasabb gol szamot.
        int highestGoalNumber = Logic.topScorer(players);
        
        System.out.println("The highest top score is " + highestGoalNumber + ".");
    }
    
    public static void teamsGoalCount(Team[] teams) {
        String[] teamsWithGoals = Logic.teamsGoalCount(teams);
        
        System.out.println("The teams scores are the following:");
        for (int i = 0; i < teamsWithGoals.length; i++) {
            System.out.println(teamsWithGoals[i]);
        }
    }
    
    public static void captains(Player[] players) {
        Player[] captains = Logic.captainsV2(players);
        
        System.out.println("The captains of each teams are the following:");
        for (int i = 0; i < captains.length; i++) {
            System.out.println(captains[i].getName());
        }
    }
    
    public static void lessThanTwenty(Team[] teams) {
        Boolean lessThanTwenty = Logic.lessThanTwenty(teams);
        
        if (lessThanTwenty) {
            System.out.println("There is a team which scored less than 20 goals.");
        } else {
            System.out.println("There is no team which scored less than 20 goals.");
        }
    }
    
    //Logic.captainGoals does not require a PrintTest method.
    
    //Logic.teamsOrderedByGoals does not require a PrintTest method.
    
    //Main.getTeamByUser does not require a PrintTest method.
    
    //Logic.listOfPlayerInTeam does not require a PrintTest method.
    
    
    
    
    
}
