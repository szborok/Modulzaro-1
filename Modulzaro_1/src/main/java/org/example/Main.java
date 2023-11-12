package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String playerSource = "Claudio Bravo-33-0-kapus-false#Gerrard Pique-29-7-védő-false#Jordi Alba-27-10-védő-false#Sergio Busquets-28-4-középpályás-true#Andrés Iniesta-32-8-középpályás-false#Ivan Rakitic-28-6-középpályás-false#Lionel Messi-29-18-csatár-false#Luis Suárez-29-15-csatár-false#Keylor Navas-29-0-kapus-false#Sergio Ramos-30-4-védő-true#Marcelo-28-7-védő-false#Luka Modric-30-8-középpályás-false#Toni Kroos-26-10-középpályás-false#Casemiro-24-7-középpályás-false#Cristiano Ronaldo-31-17-csatár-false#Karim Benzema-28-16-csatár-false#Jan Oblak-23-0-kapus-false#Diego Godín-30-2-védő-true#Filipe Luís-31-3-védő-false#Koke-24-7-középpályás-false#Saúl Ñíguez-21-9-középpályás-false#Gabi-33-4-középpályás-false#Antoine Griezmann-25-32-csatár-false#Fernando Torres-32-11-csatár-false#Manuel Neuer-30-0-kapus-true#Jerome Boateng-28-2-védő-false#David Alaba-24-5-védő-false#Arturo Vidal-29-10-középpályás-false#Thiago Alcántara-25-7-középpályás-false#Xabi Alonso-34-3-középpályás-false#Robert Lewandowski-27-17-csatár-false#Thomas Müller-27-12-csatár-false#Peter Gulácsi-26-0-kapus-false#Willi Orban-24-2-védő-false#Marvin Compper-31-1-védő-true#Naby Keïta-21-2-középpályás-false#Stefan Ilsanker-27-1-középpályás-false#Emil Forsberg-24-3-középpályás-false#Yussuf Poulsen-22-5-csatár-false#Timo Werner-20-10-csatár-false#Roman Bürki-25-0-kapus-false#Sokratis Papastathopoulos-28-2-védő-false#Mats Hummels-27-7-védő-true#Julian Weigl-20-10-középpályás-false#Ilkay Gündogan-25-8-középpályás-false#Shinji Kagawa-27-5-középpályás-false#Perre Emerick Aubemeyang-27-12-csatár-false#Marco Reus-27-10-csatár-false#Gianluigi Donnarumma-17-0-kapus-false#Mattia De Sciglio-23-0-védő-false#Alessio Romagnoli-21-1-védő-false#Suso-22-7-középpályás-false#Juraj Kucka-29-3-középpályás-false#Riccardo Montolivo-31-3-középpályás-true#Carlos Bacca-29-20-csatár-false#M'Baye Niang-21-4-csatár-false#Wojciech Szczęsny-26-0-kapus-false#Alessandro Florenzi-25-1-védő-false#Konstantinos Manolas-25-0-védő-false#Radja Nainggolan-28-5-középpályás-false#Kevin Strootman-26-1-középpályás-false#Daniele De Rossi-33-2-középpályás-true#Edin Džeko-30-3-csatár-false#Mohamed Salah-24-5-csatár-false#Samir Handanović-32-0-kapus-false#Miranda-32-2-védő-false#Danilo D'Ambrosio-27-2-védő-false#Gary Medel-29-1-középpályás-false#Marcelo Brozović-23-4-középpályás-false#Mauro Icardi-23-15-csatár-true#Ivan Perišić-27-7-csatár-false#Éder Citadin Martins-29-8-csatár-false#Joe Hart-29-0-kapus-false#Vincent Kompany-30-4-védő-true#John Stones-22-0-védő-false#Yaya Touré-33-6-középpályás-false#Kevin De Bruyne-25-7-középpályás-false#Fernandinho-31-5-középpályás-false#Sergio Agüero-28-24-csatár-false#Raheem Sterling-21-11-csatár-false#Simon Mignolet-28-0-kapus-false#Dejan Lovren-27-2-védő-false#Nathaniel Clyne-25-2-védő-false#Jordan Henderson-26-2-középpályás-true#Philippe Coutinho-24-12-középpályás-false#Emre Can-22-5-középpályás-false#Roberto Firmino-25-11-csatár-false#Sadio Mané-24-15-csatár-false#David de Gea-25-0-kapus-false#Chris Smalling-26-4-védő-false#Daley Blind-26-2-védő-false#Paul Pogba-23-2-középpályás-false#Juan Mata-28-2-középpályás-false#Ander Herrera-26-2-középpályás-false#Zlatan Ibrahimović-34-10-csatár-true#Marcus Rashford-18-3-csatár-false";
        String teamsSource = "FC Barcelona-BAR-1899?Real Madrid-RMA-1902?Atlético Madrid-ATM-1903?Bayern München-FCB-1900?RB Leipzig-RBL-2009?Borussia Dortmund-BRD-1909?AC Milan-ACM-1899?AS Roma-ASR-1927?Internazionale-INT-1908?Manchester City-MCY-1880?Liverpool-LIV-1892?Manchester United-MUN-1878?";

        Player[] mennyeimegyeiJatekosok = Factory.playerArrayGenerator(playerSource);
        Team[] borsodiCsapatok          = Factory.teamArrayGenerator(teamsSource);
        
        System.out.println("4. feladat print");
        teamOutput(borsodiCsapatok);
        System.out.println("---");
        
        System.out.println("6. feladat print");
        PrintTest.connectPlayersWithTeams(mennyeimegyeiJatekosok,borsodiCsapatok);
        System.out.println("---");
        
        System.out.println("7-1 feladat print");
        PrintTest.youngestPlayer(mennyeimegyeiJatekosok);
        System.out.println("---");
        
        System.out.println("7-2 feladat print");
        PrintTest.oldestTeam(borsodiCsapatok);
        System.out.println("---");
        
        System.out.println("7-3 feladat print");
        PrintTest.topScorer(mennyeimegyeiJatekosok);
        System.out.println("---");
        
        System.out.println("7-4 feladat print");
        PrintTest.teamsGoalCount(borsodiCsapatok);
        System.out.println("---");
        
        System.out.println("7-5 feladat print");
        PrintTest.captains(mennyeimegyeiJatekosok);
        System.out.println("---");
        
        System.out.println("7-6 feladat print");
        PrintTest.lessThanTwenty(borsodiCsapatok);
        System.out.println("---");
        
        System.out.println("7-7 feladat print");
        Logic.captainGoals(mennyeimegyeiJatekosok);
        System.out.println("---");
        
        System.out.println("7-7 feladat print");
        Logic.teamsOrderedByGoals(borsodiCsapatok);
        System.out.println("---");
        
        System.out.println("7-8 es 7-9 feladat print");
        Integer userInput = Main.getTeamByUser();
        Logic.listOfPlayerInTeam(borsodiCsapatok,userInput);
        System.out.println("---");
        
        
        
        






    }
    
    //4. feladat - Csapat neve: FC Barcelona, Rövidítése: BAR, Alapítás éve: 1899
    private static void teamOutput(Team[] teams) {
        for (int i = 0; i < teams.length; i++) {
            Team currentTeam = teams[i];
            System.out.println("Csapat neve: " + currentTeam.getName() +
                    " Rövidítése: " + currentTeam.getShortName() +
                    " Alapítás éve: " + currentTeam.getYearsOfFoundation());
        }
    }
    
    //7-8. feladat
    private static Integer getTeamByUser() {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        
        System.out.println("Kérem adja meg, hogy melyik csapat játékos listáját szeretné lekérni!");
        userInput = scanner.nextInt();
        
        return userInput;
    }
    
    
    
    
    
    
    
}