package com.example.hobbie.model.entities;

import com.example.hobbie.model.entities.enums.GenderEnum;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "app_clients")
public class AppClient extends UserEntity implements Serializable {
    private String fullName;
    private GenderEnum gender;
    private List<Hobby> hobby_matches;


    public AppClient() {
    }

    public AppClient(String username, String email, List<UserRoleEntity> roles, String password, String fullName, GenderEnum gender) {
        super(username, email, roles, password);
        this.fullName = fullName;
        this.gender = gender;
    }

    @Column(name = "full_name", nullable = false)
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    @Column
    @Enumerated(EnumType.STRING)
    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    @ManyToMany
    public List<Hobby> getHobby_matches() {
        return hobby_matches;
    }

    public void setHobby_matches(List<Hobby> hobby_matches) {
        this.hobby_matches = hobby_matches;
    }
}
