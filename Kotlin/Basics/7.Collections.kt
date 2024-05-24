fun main() {
    // Read Only
    var list1 = listOf("Apple", "Banana", "Cherry")
    println(list1)
    println(list1[0])
    // Mutable
    var list2 = mutableListOf("Apple", "Banana", "Cherry", "Burn")
    println(list2[0])
    list2[0] = "Hello"
    list2.add("BurnKnuckle")
    println(list2)
    list2.removeAt(2)
    list2.removeFirst()
    list2.removeLast()
    list2.remove("Burn")
    println(list2)
    // Sets
    val fruits = setOf("Apple", "Banana", "Cherry")
    println(fruits)
    val fs = mutableSetOf("Apple", "Banana", "Cherry")
    println(fs)

}