package com.management.database.Dhis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DhisServiceLayer {

    private final DhisRepository dhisRepository;
     @Autowired
    public DhisServiceLayer(DhisRepository dhisRepository) {
        this.dhisRepository = dhisRepository;
    }

    public List<DhisMembers> getDhisMembers(){
       return dhisRepository.findAll();
    }
}
