package com.doganur.bootcamphomework.secondassignment

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    while (true) {
        println("Please enter the parking duration in hours (enter '0' to exit):")

        if (!scanner.hasNextInt()) {
            println("Invalid input. Please enter a valid number.")
            scanner.next()
            continue
        }

        val parkingDuration = scanner.nextInt()

        if (parkingDuration == 0) {
            println("Exiting the program.")
            break
        }

        if (parkingDuration < 0) {
            println("Parking duration cannot be negative. Please try again.")
            continue
        }

        val fee = calculateParkingFee(parkingDuration)
        println("The parking fee for $parkingDuration hours is: $fee ")
    }
}

fun calculateParkingFee(hours: Int): Int {
    val firstHourFee = 50
    val additionalHourFee = 10

    return if (hours == 1) {
        firstHourFee
    } else {
        firstHourFee + ((hours - 1) * additionalHourFee)
    }
}