package decorateur;


import composant.Boisson;

public class Noisette extends DecorateurBoisson {

    public Noisette(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 0.25 + boisson.cout();
    }
    @Override
    public String getDescription() {
        return boisson.getDescription() + " Au Noisette";
    }
}
