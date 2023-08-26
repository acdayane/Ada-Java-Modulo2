package br.btg.zombiedice.model;

import java.util.List;

public class Zombie {
    
    private String name;
    private int brainCount = 0;
    private int shootCount = 0;
    
    public Zombie(String name) { //construtor que obriga criar o nome
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getBrainCount() {
        return brainCount;
    }

    public int getShootCount() {
        return shootCount;
    }

    public void setBrainCount(int brainCount) {
        this.brainCount = brainCount;
    }

    public void play(Bowl bowl) {
        List<Die> dice = bowl.pickDice(3);
        for (Die die: dice) {
            DieValue dieSide = die.roll();
            System.out.println(name + ", o valor sorteado foi: " + dieSide);
        }
    }

}
