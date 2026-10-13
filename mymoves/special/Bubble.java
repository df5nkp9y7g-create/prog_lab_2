package mymoves.special;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;


public final class Bubble extends SpecialMove {

    public Bubble() {
        super(Type.WATER, 40, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) {
            p.setMod(Stat.SPEED, -1);
        }

    }

    @Override
    protected String describe() {
        return "использует Bubble";
    }
}
