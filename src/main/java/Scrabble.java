public class Scrabble {

 public Integer runScrabble(String word) {
    word = word.toLowerCase();
    char[] charWord = word.toCharArray();

    String alpha = "abcdefghijklmnopqrstuvwxyz";
    Integer [] scores = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};

    Integer total = 0;
    for ( char letter : charWord) {
      Integer letterScore = scores[alpha.indexOf(letter)];
      total += letterScore;
    }
    return total;
   }
}
