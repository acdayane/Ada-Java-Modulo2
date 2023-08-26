package br.btg.zombiedice.model;

public class RedDie extends Die {

    public RedDie() {
        //super chama o construtor da classe pai
        super (
            new DieValue[]{
                DieValue.SHOOT,
                DieValue.SHOOT,
                DieValue.SHOOT,
                DieValue.RUNNER,
                DieValue.RUNNER,
                DieValue.BRAIN        
            }
        );
    }   
}
