package study.ducksunlee.chap9.langve;

import java.util.Arrays;
import java.util.List;

/**
 * Created by 이영호 on 2017-11-07.
 */
public class MockHighScoreService implements HighScoreService {
    @Override
    public List<String> getTopThreePlayers() {
        return Arrays.asList("mockUser1", "mockUser2", "mockUser3");
    }
}
