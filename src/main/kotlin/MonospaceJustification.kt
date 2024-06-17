package org.example

fun justify(text: String, width: Int) = when {
    textIsSameLengthAsWidth(text, width) -> text
    textIsShorterThanWidth(text, width) -> paddedText(text, width)
    else -> ""
}

private fun textIsShorterThanWidth(text: String, width: Int) = text.length < width

private fun textIsSameLengthAsWidth(text: String, width: Int) = text.length == width

private fun paddedText(text: String, width: Int): String {
    var textLength = text.length
    return text.split(" ")
        .joinToString(" ") {
        if (textSmallerThanWidth(width, textLength)) {
            textLength++
            it.padEnd(it.length + 1, ' ')
        } else {
            it
        }
    }
}

private fun textSmallerThanWidth(width: Int, textLength: Int) = width > textLength
