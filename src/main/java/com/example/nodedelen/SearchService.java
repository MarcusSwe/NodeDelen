package com.example.nodedelen;


import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

@Service
public class SearchService {


    public Set<String> findAll(String searchItem){

        String x = searchItem.toLowerCase();

        Set<String> test = new HashSet<>();

        try (Scanner lasFil = new Scanner(new File("themes.csv"))) {
            while(lasFil.hasNextLine()){
                String line = lasFil.nextLine();
                String y = line.toLowerCase();

                if(y.contains(x)){
                    test.add(line);
                }
            }
            if(test.size()<1){
                test.add("theme not found");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return test;
    }
}

