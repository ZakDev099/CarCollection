package cars.classes

import java.io.*

object ByteIO {

    fun saveCars(cars : List<Car>) {
        try {
            println("Saving carList to cars.dat...")
            val fileOut = FileOutputStream("cars.dat")
            val objectOut = ObjectOutputStream(fileOut)
            objectOut.writeObject(cars)
            fileOut.close()
            println("cars.dat saved successfully!")
        } catch (e:IOException) {
            println(e)
        }
    }

    fun loadCars(): List<Car> {
        println("Loading carList from file...")
        var carList: List<Car> = listOf()

        try {
            val fileIn = FileInputStream("cars.dat")
            val objectIn = ObjectInputStream(fileIn)
            @Suppress("UNCHECKED_CAST") // carList will always be List<Car>
            carList = objectIn.readObject() as List<Car>
            fileIn.close()
        } catch(e: IOException) {
            println(e)
        } catch(e: ClassNotFoundException) {
            println(e)
        }

        return carList
    }
}