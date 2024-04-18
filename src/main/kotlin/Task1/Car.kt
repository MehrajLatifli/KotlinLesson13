package Task1

data class Car(var name: String? = null, var power: Double? = null, var color: String?=null) {

    fun powerOn(power_: Double?): Double? {
        if (power_ != null && power != null) {
            power= power!! + power_
            return power
        }

        return null
    }

    fun powerLess(power_: Double?): Double? {
        if (power_ != null && power != null) {
            power= power!! - power_
            return power
        }
        return null
    }

    fun colorChange(color_: String?): String? {
        if (color != null) {
            color=color_

            return  color
        }
        return null
    }

    fun nameChange(name_: String?): String? {
        if (name != null) {
            name=name_

            return  name
        }
        return null
    }
}


