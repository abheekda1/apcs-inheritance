public class TypeOneBSupernova extends TypeOneSupernova {
    private boolean b = true;

    public TypeOneBSupernova() {
        super(1, -5.05, false);
    }

    public TypeOneBSupernova(int size, double magnitude) {
        super(size, magnitude, false);
    }

    @Override
    public void explode() {
        System.out.println("This Type IIb supernova is exploding!!!");
    }
}
