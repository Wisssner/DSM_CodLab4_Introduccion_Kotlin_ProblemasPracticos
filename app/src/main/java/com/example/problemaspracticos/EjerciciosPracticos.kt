package com.example.problemaspracticos

fun main() {

    imprimirMensajes()
    concatenacionCadenas()
    operacionesMatematicas()
    println("Alert: ${displayAlertMessage(emailId = "user@example.com")}")
    println("Walking 4000 steps burns ${pedometerStepsToCalories(4000)} calories")
    println("Have I spent more time using my phone today: ${compareTime(300, 250)}")
    printWeatherForCity("Ankara", 27, 31, 82)
    printWeatherForCity("Tokyo", 32, 36, 10)
    printWeatherForCity("Cape Town", 59, 64, 2)
    printWeatherForCity("Guatemala City", 50, 55, 7)
}


fun imprimirMensajes() {
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")
}

fun concatenacionCadenas() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}

fun operacionesMatematicas() {
    val firstNumber = 10
    val secondNumber = 5
    println("$firstNumber + $secondNumber = ${firstNumber + secondNumber}")
    println("$firstNumber - $secondNumber = ${firstNumber - secondNumber}")
}

fun add(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}

fun subtract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}

fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String): String {
    return "There is a new sign-in request on $operatingSystem for your Google Account $emailId."
}

fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    return numberOfSteps * caloriesBurnedForEachStep
}

fun compareTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}

fun printWeatherForCity(cityName: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int) {
    println("City: $cityName")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $chanceOfRain%")
    println()
}

