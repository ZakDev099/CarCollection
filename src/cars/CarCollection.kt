package cars

import cars.classes.*

fun main(){
    // Initializing Car objects into a list
    val carList = listOf<Car>(
        Car("Toyota", "Corolla", 2024, 0),
        Car("Ford", "Focus", 2023, 0),
        Car("Mazda", "CX-5", 2024, 0),
        Car("Hyundai", "i30", 2023, 0),
        Car("Honda", "Civic", 2022, 45200),
        Car("Nissan", "X-Trail", 2021, 78650),
        Car("Volkswagen", "Golf", 2023, 12800),
        Car("Kia", "Sportage", 2022, 36500),
        Car("Subaru", "Outback", 2020, 90210),
        Car("BMW", "3 Series", 2021, 54300)
    )

    // Create UI object and run program loop
    val userInterface = UserInterface(carList)
    userInterface.menuController()
}