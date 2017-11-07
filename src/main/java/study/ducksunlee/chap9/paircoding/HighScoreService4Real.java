package study.ducksunlee.chap9.paircoding;

import java.util.Arrays;
import java.util.List;

/**
 * Created by LSD on 2017-11-07.
 */
public class HighScoreService4Real implements HighScoreService {
    @Override
    public List<String> getTopThreePlayers() {
        return Arrays.asList("realUser1", "realUser2", "realUser3");
    }
}
