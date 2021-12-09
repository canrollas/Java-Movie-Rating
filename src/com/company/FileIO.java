package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;


public class FileIO {
    Stack<Object> contentStackSorted = new Stack<>();

    public FileIO() throws FileNotFoundException {

        int counter = 1;
        while (counter < 6) {
            File contents = new File("src/com/company/contents.csv");
            Scanner myReader = new Scanner(contents);
            while (myReader.hasNextLine()) {
                String[] splitterArray = myReader.nextLine().split(",");
                if (!splitterArray[0].equals("")) {
                    if (Integer.parseInt(splitterArray[0]) == counter) {
                        if (splitterArray[1].equals("0")) {
                            FilmContentObjects filmobj = new
                                    FilmContentObjects(Integer.parseInt(splitterArray[0]),
                                    Integer.parseInt(splitterArray[1]), splitterArray[2],
                                    Integer.parseInt(splitterArray[3]), Integer.parseInt(splitterArray[4]),
                                    Double.parseDouble(splitterArray[5]));
                            contentStackSorted.push(filmobj);

                        } else {
                            GameContentObjects gameContentObjects = new
                                    GameContentObjects(Integer.parseInt(splitterArray[0]),
                                    Integer.parseInt(splitterArray[1]), splitterArray[2], Integer.parseInt(splitterArray[3]),
                                    Double.parseDouble(splitterArray[4]));
                            contentStackSorted.push(gameContentObjects);
                        }
                    }
                }


            }
            counter = counter + 1;
        }

    }

}
