package br.btg.zombiedice.model;

import java.util.Random;

//cria uma abstração de dados, uma classe que não pode ser instanciada
//a classe superior não deve limitar as classes filhas (não fixa em 6)
public abstract class Die {

    private DieValue[] sides;

    //visto no package
    protected Die(DieValue[] sides) { //obriga a fornecer os dados para os lados do dado
        this.sides = sides;
    }

    public DieValue roll() {
        int index = new Random().nextInt(sides.length);
        return sides[index];
    }
}
