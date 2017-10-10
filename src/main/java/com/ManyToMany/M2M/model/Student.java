package com.ManyToMany.M2M.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by melayer on 4/10/17.
 */
@Entity
public class Student {

    @Id
    Integer id;
    String name;
    String city;

    @ManyToMany(cascade = CascadeType.ALL)
            @JoinTable(name = "stud_sub",joinColumns = @JoinColumn(name = "stud_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name = "sub_id",referencedColumnName = "id"))
    Set<Subject> sub;

    public Set<Subject> getSub() {
        return sub;
    }

    public void setSub(Set<Subject> sub) {
        this.sub = sub;
    }



    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }



}
