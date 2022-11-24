public class Sheep {
    int fur;
    boolean horns;

    public Sheep(int fur, boolean horns) {
        this.fur = fur;
        this.horns = horns;
    }

    public void setFur(int fur) {
        this.fur = fur;
    }

    public void setHorns(boolean horns) {
        this.horns = horns;
    }

    public int getFur() {
        return fur;
    }

    public boolean isHorns() {
        return horns;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "fur=" + fur +
                ", horns=" + horns +
                '}';
    }
}
