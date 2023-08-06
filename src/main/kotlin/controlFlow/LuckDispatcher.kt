package controlFlow

import java.util.Random

class LuckDispatcher {
    fun getNumber(): Int {
        return Random().nextInt()
    }
}
