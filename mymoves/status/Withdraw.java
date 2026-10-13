package mymoves.status;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;


public final class Withdraw extends StatusMove {

    public Withdraw() {
        super(Type.WATER, 0, 1);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        // скорее всего упрётся в ступень 6
        // т.к. узнать чистое значение уровня невозможно
        // (изначально хотел сделать проверку, не уйдет ли в ступень 7+)
        p.setMod(Stat.DEFENSE, 1);
    }

    @Override
    protected String describe() {
        return "использует Withdraw";
    }
}
