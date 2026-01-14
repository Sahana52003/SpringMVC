package com.xworkz.instagram.service;

import org.springframework.stereotype.Service;

@Service
public class InstagramService implements Instagram{
    @Override
    public void open() {
        System.out.println("Instagram account is opened");
    }
}
