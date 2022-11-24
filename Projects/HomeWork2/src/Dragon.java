public class Dragon {
    int wingspan;
    int jaws;

    public Dragon(int wingspan, int jaws) {
        this.wingspan = wingspan;
        this.jaws = jaws;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public void setJaws(int jaws) {
        this.jaws = jaws;
    }

    public int getWingspan() {
        return  this.wingspan;
    }

    public int getJaws() {
        return this.jaws;
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "wingspan=" + wingspan +
                ", jaws=" + jaws +
                '}';
    }
}


