package mymoves.status;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Status;


public final class Rest extends StatusMove {

    public Rest() {
        super(Type.PSYCHIC, 0, 1);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        double needToHeal = p.getStat(Stat.HP) - p.getHP();
        p.setMod(Stat.HP, -(int)needToHeal);
        p.setCondition(new Effect().condition(Status.SLEEP).turns(2).attack(0));
    }


    @Override
    protected String describe() {
        return "использует Rest";
    }
}
