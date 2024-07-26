package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class TvShow {
    String showName;
    int numEps;
    String genre;

    public TvShow(String showName, int numEps, String genre) {
        this.showName = showName;
        this.numEps = numEps;
        this.genre = genre;
    }
    public TvShow(String showName) {
        this.showName = showName;
        this.numEps = 0;
        this.genre = null;
    }

    public String getShowName() {
        return showName;
    }
    public int getNumEps() {
        return numEps;
    }
    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "The name of the show is " + getShowName() + " with " + getNumEps() + " episodes. The genre is " + getGenre();
    }

    public static void main(String[] args) {
        // TV SHOWS PORTION -----------------------------------------------------------------------------
        ArrayList<TvShow> myTvShows = new ArrayList<>();
        Scanner input = new Scanner(System.in);


        System.out.println("Tv Show Menu");
        System.out.println("Entering nothing will stop the loop.");

        // Add object using overloaded constructor
        TvShow spongeBob = new TvShow("Sponge Bob");

        while (true) {
            System.out.println("Please enter a name: ");
            String name = input.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("How many episodes?");
            int episodes = input.nextInt();
            String genre = input.nextLine();
            if (episodes != 0) {
                System.out.println("What is the genre?");
                genre = input.nextLine();
            }

            myTvShows.add(new TvShow(name,episodes,genre));


        }
        for (TvShow ts : myTvShows) {
            System.out.println(ts);
        }
        // TV SHOWS PORTION END ------------------------------------------------------------------------
    }

}
