package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val result = mutableListOf<Int>()
    val indexMap = mutableMapOf<Int, MutableList<Int>>()

    for (i in numbers.indices) {
        val complement = target - numbers[i]

        indexMap[complement]?.forEach { j ->
            result.add(j)
            result.add(i)
        }

        indexMap.getOrPut(numbers[i]) { mutableListOf() }.add(i)
    }

    // Проверка на наличие пар
    require(result.isNotEmpty()) {
        "Не найдено пар с суммой $target в массиве ${numbers.contentToString()}"
    }

    return result.toIntArray()
}