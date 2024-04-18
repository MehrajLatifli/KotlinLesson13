package Task2

data class Lion(override var name: String?, override var height: Double?, override var weight: Double?) :IAnimal {

    override fun sound(): String {
        return "Roar"
    }
}