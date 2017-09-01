package Serialization;

import java.io.*;

public class GameSaverTest {
    public static void main (String[] args) {
        GameCharacter one = new GameCharacter();
        GameCharacter two = new GameCharacter();
        GameCharacter three = new GameCharacter();

        one.setPower(50);
        one.setType("Elf");
        one.setWeapons(new String[]{"bow", "sword", "dust"});

        two.setPower(200);
        two.setType("Troll");
        two.setWeapons(new String[]{"bare hands", "big ax"});

        three.setPower(120);
        three.setType("Magician");
        three.setWeapons(new String[]{"spells", "invisibility"});

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
            os.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        one = null;
        two = null;
        three = null;

        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
            GameCharacter oneRestore = (GameCharacter) is.readObject();
            GameCharacter twoRestore = (GameCharacter) is.readObject();
            GameCharacter threeRestore = (GameCharacter) is.readObject();

            System.out.println("One's type: " + oneRestore.getType() + oneRestore.printProps());
            System.out.println("Two's type: " + twoRestore.getType() + twoRestore.printProps());
            System.out.println("Three's type: " + threeRestore.getType() + threeRestore.printProps());

            is.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
