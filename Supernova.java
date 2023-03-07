public abstract class Supernova {
    int size;
    double magnitude;
    boolean showsHydrogenLines;

    public Supernova(int size, double magnitude, boolean showsHydrogenLines) {
        this.size = size;
        this.magnitude = magnitude;
        this.showsHydrogenLines = showsHydrogenLines;
    }

    public abstract void explode();
    public void eatASandwich() {
        System.out.println("Eating a sandwich!");
    }
}
