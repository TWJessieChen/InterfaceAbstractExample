class JCGun : Weapon() {

    override fun damage(): Int {
        return 80
    }

    override fun range(): Int{
        return 200
    }

    override fun getName(): String?{
        return JCGun::class.java.simpleName
    }
}