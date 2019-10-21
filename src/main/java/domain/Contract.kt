package domain

import java.util.*

data class Contract(

        var number: Long,
        var tariff: Tariff,
        var options: HashSet<Option>
) {
    fun addOption(option: Option) = options.add(option)
    fun removeOption(option: Option) = options.remove(option)
}