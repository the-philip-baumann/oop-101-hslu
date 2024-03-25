package ch.hslu.oop.S05.A1_3;

public abstract class Element extends AbstractNamed {
    private static final String GASFOERMIG = "gasförmig";
    private static final String FEST = "fest";
    private static final String FLUESSIG = "flüssig";

    private final String symbol;
    private final double schmelzpunkt;
    private final double siedepunkt;

    protected Element(String symbol, double schmelzpunkt, double siedepunkt) {
        super();
        this.symbol = symbol;
        this.schmelzpunkt = schmelzpunkt;
        this.siedepunkt = siedepunkt;
    }

    public String getAggregatsZustand(double celsius) {
        if (isGasfoermig(celsius)) {
            return GASFOERMIG;
        } else if (isFest(celsius)) {
            return FEST;
        } else {
            return FLUESSIG;
        }
    }

    private boolean isFest(double celsius) {
        return celsius <= schmelzpunkt;
    }

    private boolean isGasfoermig(double celsius) {
        return celsius >= siedepunkt;
    }

    @Override
    public String toString() {
        return "Element{" + "name=" + super.getName() + ", symbol=" + symbol + ", schmelzpunkt=" + schmelzpunkt + ", siedepunkt=" + siedepunkt + '}';
    }
}
