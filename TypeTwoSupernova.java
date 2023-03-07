public class TypeTwoSupernova extends Supernova {
    private boolean spectrum = false;

    public boolean isShowsHydrogenLines() {
        return showsHydrogenLines;
    }

    public void setShowsHydrogenLines(boolean showsHydrogenLines) {
        this.showsHydrogenLines = showsHydrogenLines;
    }

    public TypeTwoSupernova() {
        super(1, 0.5, true);
    }

    public TypeTwoSupernova(int size, double magnitude) {
        super(size, magnitude, true);
    }

    public void explode() {
        System.out.println("This Type II supernova is exploding!!!");
    }
}