package day4

import java.security.MessageDigest
import javax.xml.bind.DatatypeConverter

val input = "bgvyzdsv"

fun main(args: Array<String>) {
    val md = MessageDigest.getInstance("MD5")
    var i = 1
    while (true) {
        md.reset()
        val digest = md.digest("$input$i".toByteArray())
        val hex = DatatypeConverter.printHexBinary(digest)
        if (hex.startsWith("000000")) {
            break
        }
        i++
    }
    println("Lowest value that results in 5 leading zeros is $i")
}