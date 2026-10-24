package mypokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import mymoves.status.Swagger;
import mymoves.physical.RazorLeaf;
import mymoves.status.Withdraw;
import mymoves.physical.Tackle;
import mymoves.special.MistBall;


public final class Luxio extends Shinx {

    public Luxio(String name, int level) {
        super(name, level);
        setStats(60, 85, 49, 60, 49, 60);
        setType(Type.ELECTRIC);
        setMove(new MistBall());
    }
}
