package org.vashonsd;

import java.util.ArrayList;

public class Main {

    /**
     * For now, use the main() method to print out the name of a show.
     * Create several Performers by giving them names and descriptions.
     * If you want a performer to have had one or more hit songs, use the performer's
     * .addHit() method along with the name of the hit.
     * Then print out the performers.
     */
    public static void main(String[] args) {
        System.out.println("Superbowl Halftime Show.");
        Performer firstPerformer = new Performer("The Rock" , "Actor");
        firstPerformer.addHit("Face Off");
        System.out.println("Performer 1 is " + firstPerformer);
        Performer secondPerformer = new Performer("Bill Gates" , "Rich Dude");
        System.out.println("Performer 2 is " + secondPerformer);
        Performer thirdPerformer = new Performer("Serena Williams " , "Tennis Player");
        thirdPerformer.addHit("Tennis is the best sport");
        thirdPerformer.addHit("Ping pong is worse than tennis");
        System.out.println("Performer 3 is " + thirdPerformer);



    }
}




