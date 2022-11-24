public class Base1 {
    public static void main(String[] args) {

        String hi = "         Hello ";
        String world = " World!";
        char newLine = '\n';
        String all = hi + world + newLine;
        String newAll = all.replaceAll("\s","");
        int x = 0;

        while (x<3){
            x++;
            System.out.print(newAll);
        }

    }
}
