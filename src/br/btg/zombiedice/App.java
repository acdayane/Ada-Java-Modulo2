package br.btg.zombiedice;

import br.btg.zombiedice.model.Die;
import br.btg.zombiedice.model.GreenDie;
import br.btg.zombiedice.model.RedDie;
import br.btg.zombiedice.model.YellowDie;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Die redDie = new RedDie();
        System.out.println("O valor sorteado no dado vermelho foi: " + redDie.roll());

        Die yellowDie = new YellowDie();
        System.out.println("O valor sorteado no dado amarelo foi: " + yellowDie.roll());

        Die greenDie = new GreenDie();
        System.out.println("O valor sorteado no dado verde foi: " + greenDie.roll());
    }
}
