package tictactoe.strategies.botplayingstrategies;


import tictactoe.models.BotDifficultyLevel;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotPlayingStrategyForDifficultyLevel(BotDifficultyLevel level) {
        return new EasyBotPlayingStrategy();
    }
}
