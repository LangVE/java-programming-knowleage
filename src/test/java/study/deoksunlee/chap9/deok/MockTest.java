package study.deoksunlee.chap9.deok;

import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;

/**
 * Created by 이상덕 on 2017-11-07.
 */
public class MockTest {
    private HighScoreService mockHighScoreService = mock(HighScoreService.class);

    public MockTest(HighScoreService highScoreService) {
        this.mockHighScoreService = highScoreService;
    }

    public String displayHighScores() {
        final List<String> topFivePlayers = mockHighScoreService.getTopFivePlayers();
        final StringBuilder sb = new StringBuilder();

        for (int i = 0; i < topFivePlayers.size(); i++) {
            String player = topFivePlayers.get(i);
            sb.append(String.format("%d.%s%n", i + 1, player ));
        }
        return sb.toString();
    }

    @Test
    public void mock_test() {

    }

}

interface HighScoreService {
    List<String> getTopFivePlayers();
    boolean saveHighScore(int score, String playerName);
}