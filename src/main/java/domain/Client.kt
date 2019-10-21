package domain

import java.time.LocalDate
import java.util.*

data class Client(
        var name: String,
        var surname: String,
        var birthday: LocalDate,
        var email: String,
        var passport: String,
        var address: String,
        var numbers: HashSet<Long>,
        var password: String
) {
    fun addNumber(number: Long) = numbers.add(number)
    fun removeNumber(number: Long) = numbers.remove(number)
}