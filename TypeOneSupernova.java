public class TypeOneSupernova extends Supernova {
    private boolean siliconIonised = false;

    public boolean isSiliconIonised() {
        return siliconIonised;
    }

    public void setSiliconIonised(boolean siliconIonised) {
        this.siliconIonised = siliconIonised;
    }

    public TypeOneSupernova() {
        super(1, -19.4, false);
    }

    public TypeOneSupernova(int size, double magnitude, boolean siliconIonised) {
        super(size, magnitude, false);
        this.siliconIonised = siliconIonised;
    }
    
    public void explode() {
        System.out.println("This Type I supernova is exploding!!!");
    }

    public void thermalRunaway() {
        System.out.println("Running away!");
    }

    public void trackSilicon() {
        System.out.println("It's there...");
    }
}