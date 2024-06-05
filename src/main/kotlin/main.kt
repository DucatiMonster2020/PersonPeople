fun main() {
    val likes: Int = 1002
var persons: String = "людям"
    if (likes % 10 == 1) persons = "человеку"
    if (likes % 10 >=2 || likes == 11) persons = "людям"
    println("Понравилось $likes $persons")
}