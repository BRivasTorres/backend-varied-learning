package com.complete.java;

public class Interface {

    public interface Prey {
        void flee();
    }

    public interface Predator {
        void hunt();
    }

    public class Rabbit implements Prey {
        @Override
        public void flee() {
            System.out.println("The ravvit is fleein");
        }
    }

    public class Hawk implements Predator {
        @Override
        public void hunt() {
            System.out.println("The hawk is hunting");
        }
    }

}
