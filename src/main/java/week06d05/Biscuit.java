package week06d05;

public class Biscuit {
    private static BiscuitType type;
    private static int gramAmount;

    private Biscuit(BiscuitType type, int gramAmount) {
        this.type = type;
        this.gramAmount = gramAmount;
    }

    public static Biscuit of(BiscuitType type, int gramAmount) {
        return new Biscuit(type, gramAmount);
    }

    @Override
    public String toString() {
        return "type=" + type + " gramAmount=" + gramAmount;

    }
