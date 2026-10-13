package mymoves.physical;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class FakeOut extends PhysicalMove {

    private int numberOfAttack = 0;

    public FakeOut() {
        super(Type.NORMAL, 40, 1, 3, 1);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        numberOfAttack++;
        return super.checkAccuracy(att, def);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        // works only in the first use
        if (numberOfAttack == 1) {
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe() {
        return "использует Fake Out";
    }
}
