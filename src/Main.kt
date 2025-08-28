fun main (args: Array<String>){
    //println("Hello World?")
    // var currentTemperature: Double = 0.0
    //   null version: var currentTemperature: Double? = null
    // lateinit version: lateinit var currentTemperature: String
    //  lazy version:   var currentTemperature: Double by lazy {}
    val temperature = Temperature()

    //temperature.currentTemperature = 45.0

    println("The currrent temperature in Cel is ${temperature.getTemp(type = TempType.CEL)}")
}