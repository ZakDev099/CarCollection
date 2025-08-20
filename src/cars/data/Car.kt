package cars.data

import java.io.Serializable

data class Car (val make : String, val model : String, val year: Int, val odometer : Int = 0) : Serializable {
    var condition = "New"

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