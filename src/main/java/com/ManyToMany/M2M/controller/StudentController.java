package com.ManyToMany.M2M.controller;

import com.ManyToMany.M2M.model.Student;
import com.ManyToMany.M2M.repository.StudentRepo;
import com.ManyToMany.M2M.repository.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by melayer on 4/10/17.
 */
@RestController
public class StudentController {

    @Autowired
    StudentRepo studentRepo;



    @PostMapping(value = "/insertstud")
    String insert(@RequestBody Student student){
        studentRepo.save(student);
        return "Data Inserted Success..!";
    }

//    @GetMapping(value = "/getdata")
//    List<String> getdb(){
//        List<String> list =studentRepo.findSutdent();
//        return list;
//    }
}
