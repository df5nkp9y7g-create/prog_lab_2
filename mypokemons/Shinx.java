package mypokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import mymoves.status.Swagger;
import mymoves.physical.RazorLeaf;
import mymoves.status.Withdraw;
import mymoves.physical.Tackle;


public class Shinx extends Pokemon {

    public Shinx(String name, int level) {
        super(name, level);
        setStats(45, 65, 34, 40, 34, 45);
        setType(Type.ELECTRIC);
        setMove(new Swagger(), new RazorLeaf(), new Withdraw(),new Tackle());
    }
}
