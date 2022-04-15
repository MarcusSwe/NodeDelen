package com.example.nodedelen;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Set;

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
    public Set<String> getSearch(@RequestHeader("password") String password, @RequestHeader("searchItem") String searchItem,
                                 HttpServletResponse response){
        if(password.equals("ad1Xs4kC6jfh7Ds8a8dDjk!fh")){
        return searchSer.findAll(searchItem);
        } else {
            response.setStatus(403);
            return null;
        }
    }

}
