package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Optional;

@Entity
public class Job extends  AbstractEntity{

//    @Id
//    @GeneratedValue
//    private int id;
//
//    @NotBlank(message = "Name is required")
//    @Size(min = 3, max=100)
//    private String name;
    @ManyToOne()
    private Employer employer;
@ManyToMany
    private List<Skill> skills;

    public Job() {
    }

    public Job(Employer anEmployer, List <Skill> someSkills) {
        super();
        this.employer=anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }


    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
