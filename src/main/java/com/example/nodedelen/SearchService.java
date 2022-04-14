package com.example.nodedelen;


import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

@Service
public class SearchService {


    public ArrayList<String> findAll(String searchItem){

        String x = searchItem.toLowerCase();

        ArrayList<String> test = new ArrayList<>();

        try (Scanner lasFil = new Scanner(new File("themes.csv"))) {
            while(lasFil.hasNextLine()){
                String line = lasFil.nextLine();
                String y = line.toLowerCase();

                if(y.contains(x)){
                    test.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return test;
    }
}

