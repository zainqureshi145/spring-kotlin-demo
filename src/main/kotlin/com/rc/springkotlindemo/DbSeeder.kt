package com.rc.springkotlindemo

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class DbSeeder(val hotelRepository: HotelRepository): CommandLineRunner {
    override fun run(vararg p0: String?){
        this.hotelRepository.deleteAll()

        //val ibis = Hotel(name = "Ibis", classification = 3, nbRooms = 30 )
        val ibis = Hotel("Ibis", 3, 30)
        val pc = Hotel(name = "Pearl Continental", classification = 5, nbRooms = 90)
        val ramada = Hotel(name = "Ramada", classification = 3, nbRooms = 190)

        //val hotels = mutableListOf<Hotel>()
        val hotels = mutableListOf<Hotel>()
        hotels.add(ibis)
        hotels.add(pc)
        hotels.add(ramada)
        //this.hotelRepository.save(hotels)
        this.hotelRepository.saveAll(hotels)
        println("Database has been initialized")


    }
}