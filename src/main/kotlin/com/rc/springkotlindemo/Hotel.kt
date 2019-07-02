package com.rc.springkotlindemo

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Entity
class Hotel(val name: String, val classification: Int, val nbRooms: Int) {//Inline Constructors

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0 //var is mutable, can change but val cannot change and is immutable
    var nbFreeRooms: Int = this.nbRooms

    //Default Constructor
    constructor(): this(name= "", classification = 0 ,nbRooms = 0)

    //Methods

    fun checkIn(nbGuests: Int){
        if(this.nbFreeRooms >= nbGuests){
            this.nbFreeRooms -= nbGuests
        }
    }

    fun checkOut(nbGuests: Int){
        this.nbFreeRooms += nbGuests
    }
}