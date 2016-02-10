import static org.junit.Assert.*;
import org.junit.*;

public class RockPaperTest {

  @Test
  public void randomMove_assignMoveToRandomNumber_rock() {
    RockPaper testApp = new RockPaper();
    // genrandom number
    // assign that to computermove
    // computer move to correctstring of move

    assertEquals("rock", testApp.randomMove(0));
  }

  @Test
  public void checkPlayer1Wins_rockBeatsScissors_true() {
    RockPaper testApp = new RockPaper();
    assertEquals(true, testApp.checkPlayer1Wins("rock","scissors"));
  }

  @Test
  public void checkTie_rockTiesRock_true() {
    RockPaper testApp = new RockPaper();
    assertEquals(true, testApp.checkTie("rock", "rock"));
  }

  @Test
  public void runGame_paperTiesPaper_tie() {
    RockPaper testApp = new RockPaper();
    assertEquals("tie", testApp.runGame("paper","paper"));
  }
  @Test
  public void endOfGame_rockLosesPaper_player2wins() {
    RockPaper testApp = new RockPaper();
    assertEquals("player2wins", testApp.runGame("rock","paper"));
  }
}
