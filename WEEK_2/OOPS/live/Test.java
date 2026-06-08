package WEEK_2.OOPS.live;

import WEEK_2.OOPS.music.Playable;
import WEEK_2.OOPS.music.string.Veena;
import WEEK_2.OOPS.music.wind.Saxophone;

public class Test {

    public static void main(String[] args) {

        Veena veena = new Veena();
        veena.play();
        Saxophone saxophone = new Saxophone();
        saxophone.play();

        Playable p1 = new Veena();
        p1.play();

        Playable p2 = new Saxophone();
        p2.play();
    }
}
