package study.ducksunlee.chap9.langve;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

/**
 * Created by 이영호 on 2017-11-07.
 */
public class GameTest {
    @Test
    public void displayHighScores() {
        // given
        HighScoreService highScoreService = new HighScoreService4Real();
        Game game = new Game(highScoreService);

        // when
        String actualHighScoreUsers = game.displayHighScores();

        // then
        //List<String> expectedHighScoreUsers = Arrays.asList("realUser1", "realUser2", "realUser3");
        String expectedHighScoreUsers = "1 realUser1\r\n2 realUser2\r\n3 realUser3\r\n";
        Assert.assertEquals(expectedHighScoreUsers, actualHighScoreUsers);
    }

    @Test
    public void displayHighScores_byMock() {
        // given
        HighScoreService highScoreService = new MockHighScoreService();
        Game game = new Game(highScoreService);

        // when
        String actualHighScoreUsers = game.displayHighScores();

        // then
        //List<String> expectedHighScoreUsers = Arrays.asList("realUser1", "realUser2", "realUser3");
        String expectedHighScoreUsers = "1 mockUser1\r\n2 mockUser2\r\n3 mockUser3\r\n";
        Assert.assertEquals(expectedHighScoreUsers, actualHighScoreUsers);
    }

    @Test
    public void displayHighScores_byMockito() {
        // given
        final List<String> highScoreUsers = Arrays.asList("mockitoUser1", "mockitoUser2", "mockitoUser3");

        HighScoreService mockHighScoreService = Mockito.mock(HighScoreService.class);
        Mockito.when(mockHighScoreService.getTopThreePlayers())
                .thenReturn(highScoreUsers);

        Game game = new Game(mockHighScoreService);

        // when
        String actualHighScoreUsers = game.displayHighScores();

        // then
        //List<String> expectedHighScoreUsers = Arrays.asList("realUser1", "realUser2", "realUser3");
        String expectedHighScoreUsers = "1 mockitoUser1\r\n2 mockitoUser2\r\n3 mockitoUser3\r\n";
        Assert.assertEquals(expectedHighScoreUsers, actualHighScoreUsers);
    }
}
