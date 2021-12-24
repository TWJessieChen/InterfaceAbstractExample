class JC666Gun : Weapon(), Length {

    override fun damage(): Int {
        return 80
    }

    override fun range(): Int{
        return 200
    }

    override fun getName(): String?{
        return JC666Gun::class.java.simpleName
    }

    override fun weaponLength(): Int {
        return 200 * 80
    }
}