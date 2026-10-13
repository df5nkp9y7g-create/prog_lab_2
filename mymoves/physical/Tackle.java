package mymoves.physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;


public final class Tackle extends PhysicalMove {

    public Tackle() {
        super(Type.NORMAL, 40, 1);
    }

    @Override
    protected String describe() {
        return "использует Tackle";
    }
}
