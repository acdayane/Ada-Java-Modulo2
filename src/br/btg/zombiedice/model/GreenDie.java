package br.btg.zombiedice.model;

public class GreenDie extends Die {

    public GreenDie() {
        super(
            new DieValue[] {
                DieValue.BRAIN,
                DieValue.BRAIN,
                DieValue.BRAIN,
                DieValue.RUNNER,
                DieValue.RUNNER,
                DieValue.SHOOT
            }
        );
    }    
}
