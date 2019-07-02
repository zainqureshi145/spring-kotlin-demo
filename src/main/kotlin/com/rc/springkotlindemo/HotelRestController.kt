package com.rc.springkotlindemo

import org.springframework.web.bind.annotation.*

//Make it a Rest Webservice
@RestController
@RequestMapping("/hotels")
class HotelRestController(val hotelRepository: HotelRepository) {


   @GetMapping("/all")
    fun all(): MutableIterable<Hotel>{
        return this.hotelRepository.findAll()
    }

    @GetMapping("/{name}")
    fun byName(@PathVariable(value = "name") name : String):List<Hotel>{
        val hotelsByName = this.hotelRepository.findByName(name)
        return hotelsByName
    }

    @PostMapping("/checkin")
    fun checkIn(@RequestBody checkInRequest: CheckInRequest){
        val hotels = this.hotelRepository.findByName(checkInRequest.hotelName).get(0)
        hotels.checkIn(checkInRequest.nbGuests)
        this.hotelRepository.save(hotels)
    }

    @PostMapping("/checkout")
    fun checkOut(@RequestBody checkOutRequest: CheckOutRequest){
        val hotels = this.hotelRepository.findByName(checkOutRequest.hotelName).get(0)
        hotels.checkOut(checkOutRequest.nbGuests)
        this.hotelRepository.save(hotels)
    }
}