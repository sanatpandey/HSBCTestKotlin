package util

import org.example.util.FileReverse
import org.junit.jupiter.api.Test
import org.mockito.kotlin.mock
import org.mockito.kotlin.verify
import org.mockito.kotlin.whenever
import java.io.File

class FileReverseTest {

    @Test
    fun `test file reverse`() {
        val inputFile = mock<File>()
        whenever(inputFile.readText()).thenReturn("ABC")

        val outputFile = mock<File>()

        FileReverse().reverseFile(inputFile, outputFile)

        verify(outputFile).writeText("CBA")
    }
}