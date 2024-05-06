package org.example

import org.example.util.FileReverse
import java.io.File

fun main() {
    val rootDir = System.getProperty("user.dir")
    val inputFilePath = "$rootDir/input.txt"
    val outputFilePath = "$rootDir/output.txt"

    val inputFile = File(inputFilePath)
    val outputFile = File(outputFilePath)

    FileReverse().reverseFile(inputFile, outputFile)
}