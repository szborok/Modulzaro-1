package org.example;

public class Player {

    private String name;
    private String age;
    private Integer goalCount;
    private String position;
    private Boolean captain;

    public Player(String name, String age, Integer goalCount, String position, Boolean captain) {
        this.name = name;
        this.age = age;
        this.goalCount = goalCount;
        this.position = position;
        this.captain = captain;
    }

    public String getName() {return name;}
    public String getAge() {return age;}
    public Integer getGoalCount() {return goalCount;}
    public String getPosition() {return position;}
    public Boolean getIsCaptain() {return captain;}
    
    @Override
    public String toString() {
        //- Gipsz Jakab – 19 éves – Védő – 22 gól – csapatkapitány
        // - Kiss Tamás – 20 éves – Kapus – 0 gól
        String returnString =
                "   - " + this.name + " - "
                + this.age + " éves" + " - "
                + this.position + " - "
                + this.goalCount + " gól";
        
        if (this.captain) {
            returnString = returnString + " - csapatkapitány";
        }
        return returnString;
    }
}
