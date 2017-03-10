package io.github.ashwinwadte;

import java.util.ArrayList;
import java.util.Random;

public class JokeProvider {
    public ArrayList<String> jokes = new ArrayList<>();

    public JokeProvider() {
        jokes.add("What do astronauts use for money?\n" +
                "Starbucks.");

        jokes.add("What do you call Transformer`s parent?\n" +
                "Transparent.");

        jokes.add("I have a really bad habit called assuming the worst.");

        jokes.add("Give a man a plane ticket and he'll fly for a day.\n" +
                "Push a man out of a plane and he'll fly for the rest of his life.");

        jokes.add("I love it when people try to hurt my feelings when I don't have any.");

        jokes.add("Don't eat just one donut.\n" +
                "Eat two.\n" +
                "Because two negatives make a positive.\n" +
                "It's science.");
    }

    public String getJoke(){
        Random random = new Random();
        int i = random.nextInt(jokes.size());
        return jokes.get(i).toString();
    }
}
