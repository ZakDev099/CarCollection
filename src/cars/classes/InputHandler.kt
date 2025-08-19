package cars.classes

object InputHandler {

    fun retrieveInt() : Int {
        var inputIsValid = false
        var result : Int = 0

        while(!inputIsValid) {
            val userInput = readln().toIntOrNull()
            if (userInput == null) {
                println("Invalid input, try again.\n")
            } else {
                result = userInput
                inputIsValid = true
            }
        }
        return result
    }

    fun retrieveInt(validInputs : IntRange) : Int {
        var inputIsValid = false
        var result: Int = 0
        while(!inputIsValid) {
            val userInput = readln().toIntOrNull()
            if (userInput in validInputs && userInput != null) {
                result = userInput
                inputIsValid = true
            } else {
                println("Invalid input, try again.\n")
            }
        }
        return result
    }
}