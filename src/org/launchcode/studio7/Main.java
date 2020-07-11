package org.launchcode.studio7;

import org.launchcode.studio7.CD;

public class Main {


    public static void main(String[] args){

        CD mixTape =  new CD("launchCodeAlbum", 5.8, "RW", true);

        DVD movie =  new DVD("launchCodeMovie", 10.2, "RW", false);

        movie.storeData(new Data(7.2,"First Act"));
        movie.storeData(new Data(2.2,"Second Act"));
        movie.storeData(new Data(3.1,"Third Act"));

        movie.spinDisc();

    }
}