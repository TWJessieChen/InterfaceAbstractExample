/**
 * abstract可以解釋成“一定會有的東西”，所以只能繼承一次。
 *
 */

abstract class Weapon {
    abstract fun damage(): Int

    abstract fun range(): Int

    abstract fun getName(): String?
}