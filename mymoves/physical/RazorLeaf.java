package mymoves.physical;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;


public final class RazorLeaf extends PhysicalMove {

    public RazorLeaf() {
        super(Type.GRASS, 55, 0.95);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        // getStat уже возвращает double
        // RazorLef увеличивает шанс в 3 раза
        double chance = 3*att.getStat(Stat.SPEED)/512;

        if (Math.random() < chance) {
            System.out.println("Критический удар!");
            return 2;
        }
        return 1;
    }

    @Override
    protected String describe() {
        return "использует Razor Leaf";
    }
}
