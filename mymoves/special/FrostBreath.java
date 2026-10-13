package mymoves.special;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public final class FrostBreath extends SpecialMove {

    public FrostBreath() {
        super(Type.ICE, 60, 0.9);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        System.out.println("Критический удар!");
        return 2;
    }

    @Override
    protected String describe() {
        return "использует Frost Breath";
    }
}
