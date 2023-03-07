public class TypeTwoBSupernova extends TypeTwoSupernova {
    private boolean b = true;

    public TypeTwoBSupernova() {
        super(1, 0.5);
    }

    public TypeTwoBSupernova(int size, double magnitude) {
        super(size, magnitude);
    }
    
    @Override
    public void explode() {
        System.out.println("This Type IIb supernova is exploding!!!");
    }
}
