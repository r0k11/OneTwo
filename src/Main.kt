fun main()
{
    val input = "AASADDSS"
    val result = countCharacters(input)
    printResult(result)
}
fun countCharacters(input: String): Map<Char, Int>
{
    val characterCount = mutableMapOf<Char, Int>()
    for (char in input) {
        characterCount[char] = characterCount.getOrDefault(char, 0) + 1
    }
    return characterCount
}
fun printResult(characterCount: Map<Char, Int>)
{
    characterCount.toSortedMap().forEach { (char, count) ->
        println("$char - $count")
    }
}
