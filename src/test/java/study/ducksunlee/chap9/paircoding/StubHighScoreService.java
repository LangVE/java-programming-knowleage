package study.ducksunlee.chap9.paircoding;

import java.util.Arrays;
import java.util.List;

/**
 * Created by LSD on 2017-11-07.
 */
public class StubHighScoreService implements HighScoreService {
    @Override
    public List<String> getTopThreePlayers() {
        return Arrays.asList("mockUser1", "mockUser2", "mockUser3");
    }
}
