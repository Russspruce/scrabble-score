import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleScoreTest {

  @Test
  public void calculateScore_returnsScoreForSingleLetter_1() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.runScrabble("a"));
  }

  @Test
  public void calculateScore_returnsScoreForWord_15() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 15;
    assertEquals(expected, testScrabble.runScrabble("quinoa"));
  }

  @Test
  public void calculateScore_returnsScoreForUppercase_24() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 24;
    assertEquals(expected, testScrabble.runScrabble("XYLOphonE"));

  }


}
