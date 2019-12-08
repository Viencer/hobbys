package com.company.arrays.sort;

//import com.company.arrays.sort.clas.ExeptRun;

import com.company.arrays.sort.clas.Football;
import com.company.arrays.sort.clas.HobbyExeptions;
import com.company.arrays.sort.clas.Karate;
import org.apache.log4j.Logger;
import java.io.File;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;

public class Main {
    final static org.apache.log4j.Logger logger = Logger.getLogger(Main.class.getName());
    static void copy(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath());
    }

    public static void main(String[] args) throws HobbyExeptions {
        File directory = new File("copy");
        if (!directory.exists()) {
            directory.mkdir(); // это для копировния файла
        }
        Football football = new Football(585, 4, (short) 8, (byte) 4, 5, 30, "football", 30, 20, true, true);
        Football miniFootball = new Football(785, 3, (short) 2, (byte) 2, 7, 19.5, "mini football", 40, 21, true, false);
        Football soccer = new Football(346, 1, (short) 5, (byte) 3, 3, 20, "soccer", 12, 22, false, false);
        Football[] hobby = new Football[]{football, miniFootball, soccer};
        soccer.getPlayers();// ексепшн
        if (football.getPlayers() > 19) {// логирование
            logger.error("Error you have: " + football.getPlayers() + " players"); // логирование
        }
        if (football.getPlayers() < 0 && miniFootball.getPlayers() < 0){// логирование
            logger.fatal("Fatal mode players list is empty");// логирование
        }
            ArrayList<Football> foo = new ArrayList<Football>();

        for (Football i : hobby) {
            foo.add(i);
        }

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("input.txt"))) {
            for (Football i : hobby) {
                out.writeObject(foo);
            }

            File source = new File("input.txt");
            File dest = new File("copy/output.txt"); // копирование
            copy(source, dest);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        ArrayList<Football> hobb = new ArrayList<Football>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("copy/output.txt"))) {

            hobb = ((ArrayList<Football>) ois.readObject()); // чтение с файла
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }

        for (Football p : hobb) {
            System.out.println(p.tellAboutHobby()); // вывод на экран с файла
        }
    }
}
