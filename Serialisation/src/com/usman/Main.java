package com.usman;
// Serialisation is a way of converting objects to a byte value that the computer understands for storage purpose
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        User user = new User();

        user.name = "Bro";
        user.password = "I<3Pizza";

        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser"); // Note that this automatically creates a file as given as the location
        // Note that this could be any file and this could be any file even the one on the desktop
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close(); // Note that we have to close both


        System.out.println("object info saved successfully");

        // SERIAL VERSION UID
        //This is used to ensure correlation between the serialisation project and the deserialiser project in terms of digits that is, if the digits are the same then it is perfect
        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);









    }
}
