fun main() {
    val game = HangmanGame()
    game.start()
    //println(game.randomWord)
}

class HangmanGame {
    private val randomWord = /*getRandomWord().lowercase()*/ "sonic"
    //private val gameOver = false
    private var attempts = 0
    private var wordsGuessed : Array<Char> = arrayOf('s','o','c')


    fun start(){
        //do {
            if (attempts < 1) { println("Welcome to Hangman!") }
            play()
        //} while(!this.gameOver)

    }

    private fun play(){
        hangOutput()
        print("\nType a single letter: ")
        var guess = readln().lowercase()
        checkGuess(guess)

    }

    private fun checkGuess(guess:String) : Boolean{
        for(letter in guess){
            for (char in randomWord){
                if (letter == char) {
                    if (letter !in randomWord){
                        wordsGuessed += letter
                    }
                    else{
                        return true
                    }
                }
            }
        }
        return false
    }

    private fun hangOutput(){
        for(word in 1..randomWord.length){
            val arrayIndex = word - 1
            if (randomWord[arrayIndex] in wordsGuessed)
            {
                print("${randomWord[arrayIndex]} ")
            }
            else{
                print("_ ")
            }
        }
//unguessed
    }
}

