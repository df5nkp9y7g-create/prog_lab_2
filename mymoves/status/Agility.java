package mymoves.status;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;


public final class Agility extends StatusMove {

    public Agility() {
        super(Type.PSYCHIC, 0, 1);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        // см тот же нюанс из Withdraw
        p.setMod(Stat.SPEED, 2);
    }

    @Override
    protected String describe() {
        return "использует Agility";
    }
}
