package cars.classes

class Car (val make : String, val model : String, val year: Int, val odometer : Int = 0){
    var condition = "New"
    val properties = mapOf<String,Any>(
        "make" to make,
        "model" to model,
        "year" to year,
        "condition" to condition,
        "odometer" to odometer
    )
    init {
        condition = if(odometer > 0) "Used" else "New"
    }

    fun display(){
        println("""
            $make $model, $year
            Condition: $condition
            Odometer:  $odometer
            """.trimIndent())
        println()
    }
}