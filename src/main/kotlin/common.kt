public inline fun CharSequence.partitionIndexed(predicate: (Int, Char) -> Boolean): Pair<String, String> {
    val first = StringBuilder()
    val second = StringBuilder()
    forEachIndexed { i, c ->
        if (predicate(i, c)) {
            first.append(c)
        } else {
            second.append(c)
        }
    }
    return Pair(first.toString(), second.toString())
}
