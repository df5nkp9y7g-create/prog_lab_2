package mypokemons;


import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import mymoves.physical.FakeOut;
import mymoves.special.Bubble;
import mymoves.status.Amnesia;

public final class Celebi extends Pokemon {

    public Celebi(String name, int level) {
        super(name, level);
        setStats(100, 100, 100, 100, 100, 100);
        setType(Type.PSYCHIC, Type.GRASS);
        setMove(new Bubble(), new Amnesia(), new FakeOut());
    }
}
