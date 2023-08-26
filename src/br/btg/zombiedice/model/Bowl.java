package br.btg.zombiedice.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bowl {

    private List<Die> dice = new ArrayList<Die>();

    public Bowl() {} //o pote pode existir vazio

    public void put(Die die) {
        dice.add(die);
    }

    public List<Die> pickDice(Integer amount) {
        Collections.shuffle(dice); //chacoalhar o copo para pegar dados diferentes
        List<Die> buffer = new ArrayList();
        for (int i=0; i<amount; i++) {
            buffer.add(dice.remove(i));
        }
        return buffer;
    }
    
}
