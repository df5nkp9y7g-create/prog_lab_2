package main;

import mypokemons.*;
import ru.ifmo.se.pokemon.Battle;

public final class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Luxio("LUUX", 16));
        b.addAlly(new Celebi("CEL", 7));
        b.addFoe(new Lickilicky("LICK", 2));
        b.addAlly(new Mew("MEWWWW", 5));
        b.addFoe(new Rhyperior("RHYP", 10));
        b.addAlly(new Shinx("SHHHH...", 8));
        b.addFoe(new Tangrowth("TAGANROOOOG", 12));

        b.go();
    }
}
