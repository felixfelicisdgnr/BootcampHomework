package com.doganur.bootcamphomework.secondassignment

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    while (true) {
        println("Enter the number of sides of the polygon (enter '0' to quit):")

        if (!scanner.hasNextInt()) {
            println("Please enter a valid number.")
            scanner.next()
            continue
        }

        val numberOfSides = scanner.nextInt()

        if (numberOfSides == 0) {
            println("Exiting the program.")
            break
        }

        if (numberOfSides > 2) {
            val interiorAngle = calculateInteriorAngle(numberOfSides)
            println("The interior angle of a polygon with $numberOfSides sides is $interiorAngle degrees.")
        } else {
            println("Please enter a number greater than 2.")
        }
    }

}

fun calculateInteriorAngle(numberOfSides: Int): Int {
    return ((numberOfSides - 2) * 180) / numberOfSides
}