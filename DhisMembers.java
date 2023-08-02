package com.management.database.Dhis;

import javax.persistence.*;

@Entity
@Table(name = "dhis_member")
public class DhisMembers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long ID;
    private String firstName;
    private String lastName;
    private String position;

    public DhisMembers() {
    }

    public DhisMembers(Long ID, String firstName, String lastName, String position) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public DhisMembers(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "DhisMembers{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}