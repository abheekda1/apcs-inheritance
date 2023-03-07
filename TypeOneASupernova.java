public class TypeOneASupernova extends TypeOneSupernova {
    public boolean a = true;

    public TypeOneASupernova() {
        super(1, -19.4, true);
    }

    public TypeOneASupernova(int size, double magnitude) {
        super(size, magnitude, true);
    }

    @Override
    public void explode() {
        System.out.println("This Type Ia supernova is exploding!!!");
    }
}
