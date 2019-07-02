package com.rc.springkotlindemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HotelJava {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int classification;

    public int getClassification() {
        return classification;
    }

    public void setClassification(int classification) {
        this.classification = classification;
    }

    private int nbRooms;

    public int getNbRooms() {
        return nbRooms;
    }

    public void setNbRooms(int nbRooms) {
        this.nbRooms = nbRooms;
    }

    private int nbFreeRooms;

    public int getNbFreeRooms() {
        return nbFreeRooms;
    }

    public void setNbFreeRooms(int nbFreeRooms) {
        this.nbFreeRooms = nbFreeRooms;
    }

    public void checkIn(){

    }

    public void checkOut(){

    }

    public HotelJava(String name, int classification, int nbRooms) {
        this.name = name;
        this.classification = classification;
        this.nbRooms = nbRooms;
    }
}
