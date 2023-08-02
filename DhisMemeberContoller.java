package com.management.database.Dhis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping(path = "api/v1/dhismember")
public class DhisMemeberContoller {
    public DhisMemeberContoller(DhisServiceLayer dhisServiceLayer) {
        this.dhisServiceLayer = dhisServiceLayer;
    }
    @Autowired
    private final DhisServiceLayer dhisServiceLayer;
    @GetMapping
    public List<DhisMembers> getDhisMembers(){
        return dhisServiceLayer.getDhisMembers();
    }
}
