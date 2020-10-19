fun main(args: Array<String>) {
    val ken = Player("Kenny")
    ken.show()

    val louis = Player("Louis", 5)
    louis.show()

    val peter = Player("Peter", 0, 0, -100)
    peter.show()

    val axe = Weapon("axe",12)
    peter.weapon = axe
    axe.damageInflicted = 24


    ken.weapon = Weapon("Sword", 15)
    louis.weapon = ken.weapon
    ken.weapon = Weapon("Spear",30)

    louis.show()
    println(ken)

    val redPotion = Loot("Red Potion", LootType.POTION, 7.50)
    ken.addLoot(redPotion)
    val chestArmor = Loot("+3 Chest Armor", LootType.ARMOR, 80.0)
    ken.addLoot(chestArmor)
    ken.showInventory()
    ken.addLoot(Loot("Ring of Protection",LootType.RING, 40.25))
    ken.addLoot(Loot("Invisibility potion", LootType.POTION, 35.95))
    ken.showInventory()

    if (ken.dropLoot(redPotion)) {
        ken.showInventory()
    }

    val bluePotion = Loot("Blue Potion", LootType.POTION, 10.0)

    ken.dropLoot(bluePotion)

    if (ken.dropLoot("Invisibility potion")) {
        ken.showInventory()
    } else {
        println("You don't have this item")
    }
}
