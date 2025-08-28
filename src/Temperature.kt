class Temperature {
    private var currentTemperature: Double = 0.0

    fun getTemp(type: TempType) = when (type) {
        TempType.CEL -> getTempInCel()
        TempType.FAR -> getTempInFar()
        else -> getTempinKel()
    }


    private fun getTempInCel() = currentTemperature - 273.15

    private fun getTempInFar() = 9.0/5.0 * (getTempInCel() + 32)

    private fun getTempinKel() = currentTemperature
}