package com.ManyToMany.M2M.controller;

import com.ManyToMany.M2M.model.Subject;
import com.ManyToMany.M2M.repository.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by melayer on 4/10/17.
 */
@RestController
public class SubjectController {

    @Autowired
    public SubjectRepo subjectRepo;

    @PostMapping(value = "/insertsub")
    String insert(@RequestBody Subject subject){
        subjectRepo.save(subject);
        return "Data inserted in subject";
    }

    @GetMapping(value = "/getdata")
        List<String> getdb(){
        List<String> list =subjectRepo.findSutdent();
        return list;
    }

//    @GetMapping(value = "getdb")

}
