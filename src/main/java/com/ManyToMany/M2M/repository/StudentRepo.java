package com.ManyToMany.M2M.repository;

import com.ManyToMany.M2M.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by melayer on 4/10/17.
 */
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

//    @Query("select sub_id, sub_name  from stud_sub join subject where stud_id=3 and id=stud_id;")
//    List<String> findSutdent();

}
