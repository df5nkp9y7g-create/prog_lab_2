package mypokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import mymoves.special.Bubble;
import mymoves.status.Amnesia;
import mymoves.physical.FakeOut;
import mymoves.status.Agility;


public final class Mew extends Pokemon {

    public Mew(String name, int level) {
        super(name, level);
        setStats(100, 100, 100, 100, 100, 100);
        setType(Type.PSYCHIC);
        setMove(new Bubble(), new Amnesia(), new FakeOut(), new Agility());
    }
}
