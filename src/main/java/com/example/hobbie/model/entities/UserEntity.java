package com.example.hobbie.model.entities;

import com.example.hobbie.model.entities.enums.UserRoleEnum;

import javax.persistence.*;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "users")
public class UserEntity extends BaseEntity implements Serializable{


    private String username;
    private String email;
    private List<UserRoleEntity> roles = new ArrayList<>();
    private String password;


    public UserEntity(String username, String email, List<UserRoleEntity> roles, String password) {
        this.username = username;
        this.email = email;
        this.roles = roles;
        this.password = password;
    }

    public UserEntity() {
    }

    @Column(nullable = false)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    @Column(nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Column
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @ManyToMany(fetch = FetchType.EAGER)
    public List<UserRoleEntity> getRoles() {
        return roles;
    }

    public void setRoles(List<UserRoleEntity> roles) {
        this.roles = roles;
    }
}
