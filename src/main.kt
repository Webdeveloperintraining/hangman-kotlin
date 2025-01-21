fun main() {
    val game = HangmanGame()
    game.start()
}

class HangmanGame {
    private val randomWord = getRandomWord().lowercase()
    private var attempts = 6
    private var wordsGuessed: Array<Char> = arrayOf()

    /*
    This method handles the game start and the end of the game.
    It calls two methods: play(), which manages the game flow, and
    gameOver(), which checks if the game has ended.
     */
    fun start() {
        println("Welcome to Hangman!")

        do {
            play()
        } while (!gameOver())

        println("--------------")
        println("Game over")
        println(hangDraw(attempts))
        hangmanOutput()
    }

    /*
    It prints the current state of the game to the console and asks for input to keep the game running.
    It calls the hangDraw() function to draw a hang representing the player's remaining attempts and the checkGuess() function
    to verify if the guess is correct.
    */
    private fun play() {
        println(hangDraw(attempts))
        hangmanOutput()

        print("\nType a single letter: ")
        val guess = readln().lowercase()

        if(!checkGuess(guess)){
            attempts--
        }
    }

    /*
    It checks if the guessed letter typed by the player is in the hidden word.
    It returns true if the letter is in the hidden word and is added to the wordsGuessed array.
    If the guess is wrong, it returns false and an attempt is deducted
    */
    private fun checkGuess(guess:String) : Boolean{
        for(letter in guess){
            if (letter in randomWord) {
                if (letter !in wordsGuessed){
                    wordsGuessed += letter
                    return true
                }
            }
        }
        return false
    }

    /*
    It checks the conditions to end the game: either the number of attempts equals 0,
    or all the letters in the hidden word have been found.
    */
    private fun gameOver(): Boolean {
        if( attempts == 0 || randomWord.all{ letter: Char-> letter in wordsGuessed } ) {
            if (wordsGuessed.all{ letter: Char-> letter in randomWord && attempts > 0 } ) {
                println("Congratulations, you won!")
            }
            return true
        }
        else {
            return false
        }
    }

    /*
    It returns a hang drawing based on the player's number of remaining attempts.
    */
    private fun hangDraw(attempts: Int): String {
        when (attempts) {
            (6) -> {
                return hangmanArt[0]
            }

            (5) -> {
                return hangmanArt[1]
            }

            (4) -> {
                return hangmanArt[2]
            }

            (3) -> {
                return hangmanArt[3]
            }

            (2) -> {
                return hangmanArt[4]
            }

            (1) -> {
                return hangmanArt[5]
            }

            else -> {
                return hangmanArt[6]
            }
        }
    }

    /*
    This method prints the letters guessed by the player
    and the letters in the hidden word that have not been found
    */
    private fun hangmanOutput() {
        for (word in 1..randomWord.length) {
            val arrayIndex = word - 1
            if (randomWord[arrayIndex] in wordsGuessed) {
                print("${randomWord[arrayIndex]} ")
            } else {
                print("_ ")
            }
        }
    }
}