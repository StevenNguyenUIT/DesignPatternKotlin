package creationalpattern.builder

fun main(){
    val myHouse: House = HouseBuilder().setWindows(4).build()
    val myHouse1: House = HouseBuilder().setWindows(4).build()
    println(myHouse==myHouse1)
}

data class House(
    val windows: Int,
    val doors: Int,
    val roof: String,
    val garage: Boolean
)

class HouseBuilder{
    private var windows: Int = 0
    private var doors: Int = 0
    private var roof: String = "none"
    private var garage: Boolean = false

    fun setWindows(windows: Int) = apply { this.windows = windows }
    fun setDoors(doors: Int) = apply { this.doors = doors }
    fun setRoof(roof: String) = apply { this.roof = roof }
    fun setGarage(garage: Boolean) = apply { this.garage = garage }

    fun build() : House {
        return House(windows, doors, roof, garage)
    }
}