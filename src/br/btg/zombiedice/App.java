package br.btg.zombiedice;

import java.util.List;

import br.btg.zombiedice.model.Bowl;
import br.btg.zombiedice.model.Die;
import br.btg.zombiedice.model.GreenDie;
import br.btg.zombiedice.model.RedDie;
import br.btg.zombiedice.model.YellowDie;
import br.btg.zombiedice.model.Zombie;

public class App {
    public static void main(String[] args) throws Exception {
       
        Bowl bowl = new Bowl();
        bowl.put(new RedDie()); //a dificuldade do jogo depende da quantidade de cada cor de dado
        bowl.put(new RedDie());
        bowl.put(new RedDie());
        bowl.put(new RedDie());
        bowl.put(new YellowDie());
        bowl.put(new YellowDie());
        bowl.put(new YellowDie());
        bowl.put(new YellowDie());
        bowl.put(new GreenDie());
        bowl.put(new GreenDie());
        bowl.put(new GreenDie());
        bowl.put(new GreenDie());

        Zombie dayane = new Zombie("Dayane");
        dayane.play(bowl);
    }
}
