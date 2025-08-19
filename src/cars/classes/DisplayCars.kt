package cars.classes

object DisplayCars {

    fun displayAll(cars: List<Car>) {
        var carsFound = 0
        for (car in cars) {
            car.display(); carsFound++
        }
        println("$carsFound cars were found.")
        println("Press enter to continue:")
        readln()
    }

    fun displayCondition(cars: List<Car>, showNew: Boolean) {
        var carsFound = 0
        for (car in cars) {
            when {
                (car.condition.equals("new", true) && showNew) -> {car.display(); carsFound++}
                (car.condition.equals("used", true) && !showNew) -> {car.display(); carsFound++}
            }
        }
        println("$carsFound cars were found.")
        println("Press enter to continue:")
        readln()
    }

    fun displaySearched(cars: List<Car>, category: String) {
        when {
            category.equals("make", true) -> {
                val userInput = readln()
                var carsFound = 0
                for (car in cars) {
                    if (car.make.equals(userInput, true)) {car.display(); carsFound++}
                }
                println("$carsFound were found for '$userInput'")
                println("Press enter to continue:")
                readln()
            }
            category.equals("model", true) -> {
                val userInput = readln()
                var carsFound = 0
                for (car in cars) {
                    if (car.model.equals(userInput, true)) {car.display(); carsFound++}
                }
                println("$carsFound were found for '$userInput'")
                println("Press enter to continue:")
                readln()
            }
            category.equals("year", true) -> {
                val userInput = InputHandler.retrieveInt()
                var carsFound = 0
                for (car in cars) {
                    if (car.year == userInput) {car.display(); carsFound++}
                }
                println("$carsFound were found for '$userInput'")
                println("Press enter to continue:")
                readln()
            }
        }
    }

    fun displaySorted(cars: List<Car>, category: String) {
        when (category) {
            "make" -> displayAll(cars.sortedBy { it.make })
            "model" -> displayAll(cars.sortedBy { it.model })
            "year" -> displayAll(cars.sortedBy { it.year })
            "condition" -> displayAll(cars.sortedBy { it.odometer })
        }
    }
}