package com.company;

class Movie {

    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot in Movie";
    }

    public String getName() {
        return this.name;
    }
}

class Jaws extends Movie {

    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie {

    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the Universe";
    }
}

class ForgettableMovie extends Movie {
    public ForgettableMovie() {
        super("Forgettable Movie");
    }
}

public class Polymorphism {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i ++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + (i + 1) + " : " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {

        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was : " + randomNumber);

        switch (randomNumber) {

            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new ForgettableMovie();
        }

        return null;
    }
}
