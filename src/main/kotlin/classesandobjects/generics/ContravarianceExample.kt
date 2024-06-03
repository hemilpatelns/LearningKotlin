package classesandobjects.generics

open class ProgrammingLanguages {
    open fun description() {
        println("I am a programming language")
    }
}

class Java : ProgrammingLanguages() {
    override fun description() {
        println("I am Java")
    }
}

class Kotlin : ProgrammingLanguages() {
    override fun description() {
        println("I am Kotlin")
    }
}

class LanguageComparator<in T> {
    fun compare(languageOne: T, languageTwo: T): Int {
        return languageOne.toString().compareTo(languageTwo.toString())
    }
}

fun sortLanguages(languages: List<ProgrammingLanguages>, comparator: LanguageComparator<ProgrammingLanguages>) {
    val sortedLanguages = languages.sortedWith { lang1, lang2 -> comparator.compare(lang1, lang2) }
    sortedLanguages.forEach { it.description() }
}

fun main() {
    val languages = listOf(Java(), Kotlin(), Java())
    val comparator = LanguageComparator<ProgrammingLanguages>()
    sortLanguages(languages, comparator)
}