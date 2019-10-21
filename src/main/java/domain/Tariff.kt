package domain

import java.util.*

data class Tariff (
        var title: String,
        var prive: Double,
        internal var possibleOptions: HashSet<Option>
) {
    fun addOption(option: Option) = possibleOptions.add(option)
    fun removeOption(option: Option) = possibleOptions.remove(option)
}