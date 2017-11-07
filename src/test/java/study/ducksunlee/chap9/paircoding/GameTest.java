package study.ducksunlee.chap9.paircoding;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

/**
 * Created by LSD on 2017-11-07.
 */
public class GameTest {

    @Test
    public void displayHighScore() {
        // given
        HighScoreService highScoreService = new HighScoreService4Real();
        Game game = new Game(highScoreService);

        // when
        String atual = game.displayHighScore();

        // then
        String expected = "1 realUser1\r\n2 realUser2\r\n3 realUser3\r\n";
        Assert.assertEquals(expected, atual);
    }

    @Test
    public void displayHighScore_byStub() {

        // given
        HighScoreService stubHighScoreService = new StubHighScoreService();
        Game stubGame = new Game(stubHighScoreService);

        //when
        String atual = stubGame.displayHighScore();

        // then
        String expected = "1 mockUser1\r\n2 mockUser2\r\n3 mockUser3\r\n";
        Assert.assertEquals(expected, atual);
    }

    @Test
    public void displayHighScore_byMockito() {
        // given
        HighScoreService mockitoHighScoreService = Mockito.mock(HighScoreService.class);

        List<String> mockList = Arrays.asList("mockitoUser1", "mockitoUser2", "mockitoUser3");

        Mockito.when(mockitoHighScoreService.getTopThreePlayers()).
                thenReturn(mockList);

        Game stubGame = new Game(mockitoHighScoreService);

        // when
        String atual = stubGame.displayHighScore();

        // then
        String expected = "1 mockitoUser1\r\n2 mockitoUser2\r\n3 mockitoUser3\r\n";
        Assert.assertEquals(expected, atual);
    }

}
