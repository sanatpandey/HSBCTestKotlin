package org.example.util

import java.io.File

class FileReverse {
    fun reverseFile(inputFile: File, outputFile: File) {
        val content = inputFile.readText().trim()
        val reversedContent = content.reversed()
        outputFile.writeText(reversedContent)
    }
}