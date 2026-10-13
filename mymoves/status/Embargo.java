package mymoves.status;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;



public final class Embargo extends StatusMove {

    public Embargo() {
        super(Type.DARK, 0, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        // ???
        // в документации ничего не сказано про предметы
        // ???
    }

    @Override
    protected String describe() {
        return "использует Embargo";
    }
}
