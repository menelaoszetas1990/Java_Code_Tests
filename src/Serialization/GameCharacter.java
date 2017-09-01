package Serialization;

import java.io.Serializable;

public class GameCharacter implements Serializable {
    private int power;
    private String type;
    private String[] weapons;

    public int getPower() {
        return power;
    }

    public void setPower(int p) {
        power = p;
    }

    public String getType() {
        return type;
    }

    public void setType(String t) {
        type = t;
    }

    public String getWeapons() {
        String weaponList = "";
        for (int i = 0; i < weapons.length; i++) {
            weaponList += weapons[i] + " ";
        }
        return weaponList;
    }

    public void setWeapons(String[] w) {
        weapons = w;
    }

    public String printProps() {
        String message = " power: " + power + " type: " + type + " weapons: " + this.getWeapons();
        return message;
    }

}
