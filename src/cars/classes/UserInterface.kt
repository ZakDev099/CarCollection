package cars.classes

class UserInterface(val carList : List<Car>) {
    var position : Int = 0

    fun menuController() {
        var programIsAlive = true

        while (programIsAlive) {
            when (position) {
                0 -> toMainMenu()
                1 -> toDisplayMenu()
                2 -> toSortMenu()
                5 -> {println("Goodbye!"); programIsAlive = false}
            }
        }
    }

    fun toMainMenu() {
        println("""
            |   CAR COLLECTION!
            |   
            |   1. Display
            |   2. Sort
            |   3. Save Cars
            |   4. Load Cars
            |   5. Exit
            
            Please selection an option:
        """.trimIndent())

        position = InputHandler.retrieveInt(1..5)
    }

    fun toDisplayMenu() {
        println("""
            |   DISPLAY ONLY
            |
            |   0. <<<
            |   1. All Cars
            |   2. New Cars
            |   3. Used Cars
            |   4. Search Make
            |   5. Search Model
            |   6. Search Year
            
            Please selection an option:
        """.trimIndent())

        val userInput = InputHandler.retrieveInt(0..6)

        when (userInput) {
            0 -> position = 0
            1 -> DisplayCars.displayAll(carList)
            2 -> DisplayCars.displayCondition(carList, true)
            3 -> DisplayCars.displayCondition(carList, false)
            4 -> DisplayCars.displaySearched(carList, "make")
            5 -> DisplayCars.displaySearched(carList, "model")
            6 -> DisplayCars.displaySearched(carList, "year")
        }
    }

    fun toSortMenu(){
        println("""
            |   DISPLAY SORTED
            |
            |   0. <<<
            |   1. By Make
            |   2. By Model
            |   3. By Year
            |   4. By Condition 
            
            Please selection an option:
        """.trimIndent())

        val userInput = InputHandler.retrieveInt(0..4)

        when(userInput) {
            0 -> position = 0
            1 -> DisplayCars.displaySorted(carList, "make")
            2 -> DisplayCars.displaySorted(carList, "model")
            3 -> DisplayCars.displaySorted(carList, "year")
            4 -> DisplayCars.displaySorted(carList, "condition")
        }
    }
}