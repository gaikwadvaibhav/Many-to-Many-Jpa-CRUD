package com.ManyToMany.M2M.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

/**
 * Created by melayer on 4/10/17.
 */
@Entity
public class Subject {

    @Id
    Integer id;
    String subName;

    @ManyToMany(mappedBy = "sub")
    Set<Student> stud;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", subName='" + subName + '\'' +
                '}';
    }


}
