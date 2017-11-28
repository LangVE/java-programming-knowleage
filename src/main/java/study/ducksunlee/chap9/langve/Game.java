package study.ducksunlee.chap9.langve;

import java.util.List;

/**
 * Created by 이영호 on 2017-11-07.
 */
public class Game {
    private HighScoreService highScoreService;

    public Game(HighScoreService highScoreService) {
        this.highScoreService = highScoreService;
    }

    public String displayHighScores() {
        List<String> list = this.highScoreService.getTopThreePlayers();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            stringBuilder.append(String.format("%d %s%n", i + 1, list.get(i)));
        }

        System.out.println(stringBuilder.toString());

        return stringBuilder.toString();
    }
}
