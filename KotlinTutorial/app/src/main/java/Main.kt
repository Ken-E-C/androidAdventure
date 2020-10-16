fun main(args: Array<String>) {
//    val ken = Player("Kenny")
//    ken.show()
//
//    val louis = Player("Louis", 5)
//    louis.show()
//
//    val peter = Player("Peter", 0, 0, -100)
//    peter.show()
//
//    val axe = Weapon("axe",12)
//    peter.weapon = axe
//    axe.damageInflicted = 24
//
//
//    ken.weapon = Weapon("Sword", 15)
//    louis.weapon = ken.weapon
//    ken.weapon = Weapon("Spear",30)
//
//    louis.show()
//    println(ken)
//
//    val redPotion = Loot("Red Potion", LootType.POTION, 7.50)
//    ken.inventory.add(redPotion)
//    val chestArmor = Loot("+3 Chest Armor", LootType.ARMOR, 80.0)
//    ken.inventory.add(chestArmor)
//    ken.showInventory()
//    ken.inventory.add(Loot("Ring of Protection",LootType.RING, 40.25))
//    ken.inventory.add(Loot("Invisibility potion", LootType.POTION, 35.95))
//    ken.showInventory()

//    for (i in 0 until 10) {
//        println("$i squared is ${i * i}")
//    }

//    for (i in 10 downTo 0 step 2) {
//        println("$i squared is ${i * i}")
//    }
    for (i in 0..100 step 5) {
        if (i % 3 == 0 && i % 5 == 0) {
            println(i)
        }
    }
}
