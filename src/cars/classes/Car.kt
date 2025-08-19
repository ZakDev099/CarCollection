package cars.classes

class Car (val make : String, val model : String, val odometer : Int = 0){

    init {
        val condition = if(odometer > 0) "Used" else "New"
    }
}