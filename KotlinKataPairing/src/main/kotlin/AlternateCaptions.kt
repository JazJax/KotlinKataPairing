/*
Here is link to the kata: https://www.codewars.com/kata/59cfc000aeb2844d16000075/train/kotlin
 */



fun capitalize(text: String): List<String> {
    val firstString = StringBuilder();
    val secondString = StringBuilder();
    text.forEachIndexed { index, character ->
        if (isEven(index)) {
            firstString.append(character.uppercaseChar())
            secondString.append(character);
        } else {
            firstString.append(character);
            secondString.append(character.uppercaseChar())
        }
    }
    return listOf(firstString.toString(), secondString.toString())
}