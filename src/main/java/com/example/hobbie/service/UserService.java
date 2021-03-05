package com.example.hobbie.service;

import com.example.hobbie.model.entities.AppClient;
import com.example.hobbie.model.service.SignUpServiceModel;

public interface UserService {
    void seedUsers();

    boolean register(SignUpServiceModel signUpServiceModel);
}
