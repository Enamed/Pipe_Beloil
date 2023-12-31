package ru.netology.nmedia1022.utils

object Utils {
    fun numbers(count: Long): String{
        val format = when{
            count in 1000..9999 -> {
                String.format("%.1fK", count/1000.0)
            }
            count in 10_000..999_999 -> {
                String.format("%dK", count /1_000_000.0)
            }
            else -> {
                count.toString()
            }
        }
        return format
    }

}