fun main() {
    findMostRepeatingItems()
    println()
    sortMap()
}

fun findMostRepeatingItems(){
    val list = arrayListOf(1, 2, 2, 3, 3, 4, 5, 5, 5, 5, 6, 7, 7)
    val occurrences = HashMap<Int, Int>()

    list.forEach{
        val n = occurrences[it]
        if(n == null){
            occurrences[it] = 1
        }else{
            occurrences[it] = n + 1
        }

    }

    val mostOccurs = occurrences.maxBy { it.value }

    println("number ${mostOccurs?.key} appears the most: ${mostOccurs?.value} times")
}

fun sortMap(){
    val map = mapOf(  4 to "four", 5 to "seven", 1 to "one", 3 to "three")
    println(map)

    println(map.entries.sortedBy { it.key })
}