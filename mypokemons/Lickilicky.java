package mypokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import mymoves.status.Embargo;
import mymoves.status.Rest;

public final class Lickilicky extends Pokemon {

    public Lickilicky(String name, int level) {
        super(name, level);
        setStats(110, 85, 95, 80, 95, 50);
        setType(Type.NORMAL);
        setMove(new Embargo(), new Rest());
    }
}
