package mymoves.special;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;


public final class MistBall extends SpecialMove {

    public MistBall() {
        super(Type.GRASS, 95, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.5)
            p.setMod(Stat.SPECIAL_ATTACK, -1);
    }


    @Override
    protected String describe() {
        return "использует MistBall";
    }
}
