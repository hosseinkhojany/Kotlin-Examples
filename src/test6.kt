//class Animal(val name: String)
//
//class Zoo(private val animals: List<Animal>) {
//
//    operator fun iterator(): Iterator<Animal> {             // 1
//        return animals.iterator()                           // 2
//    }
//}
//
//fun main() {
//
//    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))
//
//    for (animal in zoo) {                                   // 3
//        println("Watch out, it's a ${animal.name}")
//    }
//
//}



//class Animal(val name: String)
//
//open class Zoo(private val animals: List<Animal>?) {
//    private var animalss: ArrayList<Animal> = ArrayList()
//
//    fun putAnimal(animal: Animal){
//            animalss.add(animal)
//    }
//    fun getAnimal(index: Int): Animal{
//        return animalss[index]
//    }
//    fun getAnimal(name: String): Animal{
//        for (animal in animalss) {
//            if (animal.name == name)
//                return animal
//        }
//        return Animal("NotFound")
//    }
//    fun getAll():List<Animal>{
//        when(animalss.isEmpty()){
//            true -> for (anim in animals!!) putAnimal(anim)
//            false -> return animalss
//        }
//        return animalss;
//    }
//}
//
//
//
//class Zooo(): Zoo(null)
//
//fun main() {
//
//    val zoo = Zooo()
//    zoo.putAnimal(Animal("Tiger"))
//    zoo.putAnimal(Animal("Dock"))
//
//    for (animal in zoo.getAll()){
//        println("Watch out, it's a ${animal.name}")
//    }
//
//
//}
