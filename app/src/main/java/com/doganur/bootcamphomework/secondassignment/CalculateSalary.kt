package com.doganur.bootcamphomework.secondassignment

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    while (true) {
        println("Please enter the number of days worked (enter '0' to exit):")

        if (!scanner.hasNextInt()) {
            println("Invalid input. Please enter a valid number.")
            scanner.next()
            continue
        }

        val numberOfDays = scanner.nextInt()

        if (numberOfDays == 0) {
            println("Exiting the program.")
            break
        }

        if (numberOfDays < 0) {
            println("The number of days cannot be negative. Please try again.")
            continue
        }

        calculateSalary(numberOfDays)
    }
}

fun calculateSalary(numberOfDays: Int): Int {

    val dailyWorkingHours = 8
    val currentSalary = 40
    val bonusSalary = 80
    val regularWorkingHoursLimit = 150

    val totalWorkingHours = numberOfDays * dailyWorkingHours

    val regularHours = if (totalWorkingHours > regularWorkingHoursLimit) regularWorkingHoursLimit else totalWorkingHours
    val overtimeHours = if (totalWorkingHours > regularWorkingHoursLimit) totalWorkingHours - regularWorkingHoursLimit else 0

    val salary = (regularHours * currentSalary) + (overtimeHours * bonusSalary)

    println("Employee's salary: $salary")

    return salary
}
