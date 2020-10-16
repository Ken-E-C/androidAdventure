class Player(val name: String, var level: Int = 1, var lives: Int = 3, var score: Int = 0) {
    var weapon: Weapon = Weapon("Fist", 1)
    var inventory = ArrayList<Loot>()

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
}