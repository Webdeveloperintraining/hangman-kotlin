fun getRandomWord() : String {
    val words = arrayOf(
        "Abacus", "Lighthouse", "Elephant", "Crocodile", "Horizon", "Mountain",
        "Keyboard", "Dinosaur", "Sunshine", "Universe", "Meteor", "Jellyfish",
        "Pyramids", "Lantern", "Vibrant", "Octopus", "Parachute", "Satellite",
        "Whistle", "Chemistry", "Adventure", "Spider", "Marshmallow", "Trampoline",
        "Notebook", "Picnic", "Wizard", "Helicopter", "Pyramid", "Carousel",
        "Tornado", "Ballet", "Giraffe", "Chimney", "Bumblebee", "Raccoon",
        "Volcano", "Submarine", "Train", "Treasure", "Pillow", "Marsh", "Circus",
        "Library", "Breeze", "Snowflake", "Snowman", "Bicycle", "Avalanche",
        "Lantern", "Dolphin", "Tornado", "Factory", "Mountain", "Pocket",
        "Spiderweb", "Luggage", "Whisper", "Willow", "Globe", "Acorn", "Planet",
        "Fountain", "Universe", "Raindrop", "Cloudy", "Avocado", "Acrobat",
        "Fortune", "Robot", "Lagoon", "Magician", "Cactus", "Carousel",
        "Guitar", "Wallpaper", "Thunder", "Puzzle", "Cinnamon", "Lantern",
        "Tricycle", "Jellybean", "Squirrel", "Astronaut", "Helicopter", "Lighthouse",
        "Waterfall", "Guitar", "Bonfire", "Walnuts", "Popcorn", "Bubbles",
        "Trolley", "Tapestry", "Fireworks", "Tortoise", "Stopwatch", "Desert",
        "Compass", "Banana"
    )
    return words.random()
}

val hangmanArt = arrayOf(
"""  +---+
  |   |
      |
      |
      |
      |
=========""",
"""  +---+
  |   |
  O   |
      |
      |
      |
=========""",
"""  +---+
  |   |
  O   |
  |   |
      |
      |
=========""",
"""  +---+
  |   |
  O   |
 /|   |
      |
      |
=========""",
"""  +---+
  |   |
  O   |
 /|\  |
      |
      |
=========""",
"""  +---+
  |   |
  O   |
 /|\  |
 /    |
      |
=========""",
"""  +---+
  |   |
  O   |
 /|\  |
 / \  |
      |
=========""")