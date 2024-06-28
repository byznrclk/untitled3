public class Donusümler {

    public static void main(String[] args) {
        byte b;
        int i=257;
        double d=323.142;
        System.out.printf("int>> byte dönüşümü");
        b= (byte) i;
        System.out.printf("i="+i+" b ="+b);

        System.out.printf("double >> int döşümü:");
        i= (int) d;
        System.out.printf("d=" +d+" i="+i);

        System.out.printf("double!!buyte dönüşümü:");
        b= (byte)d;
        System.out.println("d="+d+" b= "+b);



    }
}
