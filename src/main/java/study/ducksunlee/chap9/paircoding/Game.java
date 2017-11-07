package study.ducksunlee.chap9.paircoding;

import java.util.List;

/**
 * Created by LSD on 2017-11-07.
 */
public class Game {
    private HighScoreService highScoreService;

    public Game(HighScoreService highScoreService) {
        this.highScoreService = highScoreService;
    }

    public String displayHighScore() {
        List<String> topThreeUsers = highScoreService.getTopThreePlayers();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < topThreeUsers.size(); i++) {
            stringBuilder.append(String.format("%d %s%n", i + 1, topThreeUsers.get(i)));
        }

        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }
}
