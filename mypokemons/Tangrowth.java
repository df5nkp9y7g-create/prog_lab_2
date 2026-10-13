package mypokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import mymoves.status.Embargo;
import mymoves.status.Rest;
import mymoves.special.FrostBreath;
import mymoves.physical.FakeOut;

public final class Tangrowth extends Pokemon {

    public Tangrowth(String name, int level) {
        super(name, level);
        setStats(100, 100, 125, 110, 50, 50);
        setType(Type.GRASS);
        setMove(new Embargo(), new Rest(), new FrostBreath(), new FakeOut());
    }
}
