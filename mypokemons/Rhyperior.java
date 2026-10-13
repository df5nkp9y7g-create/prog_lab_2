package mypokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import mymoves.status.Embargo;
import mymoves.status.Rest;
import mymoves.special.FrostBreath;


public final class Rhyperior extends Pokemon {

    public Rhyperior(String name, int level) {
        super(name, level);
        setStats(115, 140, 130, 55, 55, 40);
        setType(Type.GROUND, Type.ROCK);
        setMove(new Embargo(), new Rest(), new FrostBreath());
    }
}
