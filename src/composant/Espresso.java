package composant;

public class Espresso extends Boisson{

    public Espresso() {
        description = "Cafe Espresso";
    }

    @Override
    public double cout() {
        return 12;
    }
}
