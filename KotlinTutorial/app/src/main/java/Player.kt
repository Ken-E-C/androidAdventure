import android.os.Build
import androidx.annotation.RequiresApi

class Player(val name: String, var level: Int = 1, var lives: Int = 3, var score: Int = 0) {
    var weapon: Weapon = Weapon("Fist", 1)
    private var inventory = ArrayList<Loot>()

    fun show(){
        print("$name is ")
        if (lives > 0) {
            println("alive")
        } else {
            println("dead")
        }
    }

    override fun toString(): String {
        return """
            name:  $name
            lives: $lives
            level: $level
            score: $score
            $weapon
        """
    }

    fun showInventory() {
        println("\n     $name's Loot Inventory:")
        for (loot in inventory) {
            println(loot)
        }
        println("================================")
    }

    fun addLoot(newLoot: Loot) {
        inventory.add(newLoot)
    }

    fun dropLoot(item: Loot): Boolean {
        return if (inventory.contains(item)) {
            inventory.remove(item)
            true
        } else {
            println("You don't have ${item.name} in your inventory")
            false
        }
    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun dropLoot(name: String): Boolean {
        println("$name will be dropped")
        return inventory.removeIf { it.name == name }
    }
}