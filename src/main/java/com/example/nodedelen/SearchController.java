package com.example.nodedelen;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping()
public class SearchController {

    private SearchService searchSer;

    @Autowired
    public SearchController(SearchService searchSer){
        this.searchSer = searchSer;
    }

    @GetMapping("/search")
    public ArrayList<String> getSearch(){
        return searchSer.findAll();
    }

}
