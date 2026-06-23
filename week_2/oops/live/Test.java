package week_2.oops.live;

import week_2.oops.music.Playable;
import week_2.oops.music.string.Veena;
import week_2.oops.music.wind.Saxophone;

public class Test {

    public static void main(String[] args) {

        Veena v = new Veena();
        v.play();

        Saxophone s = new Saxophone();
        s.play();

        Playable p;

        p = new Veena();
        p.play();

        p = new Saxophone();
        p.play();
    }
}