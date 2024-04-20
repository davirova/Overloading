public class Main {
    public static void main(String[] args) {
        over ovr = new over();
        System.out.println("ADD methodi: ");
        System.out.println(ovr.add(3,4));
        System.out.println(ovr.add(2345.765432345, 9876543.8765432));
        System.out.println(ovr.add(65432.987f, 87654));
        System.out.println(ovr.add(987654323234567.9876543212345678, 987654));
        System.out.println(ovr.add(8765.8765f,876345.87654f));
        System.out.println(ovr.add(876543212345678.9876543212345678987654, 87654.456789f));
        System.out.println("Sub methodi: ");
        System.out.println(ovr.sub(78,8));
        System.out.println(ovr.sub(6543.76543f, 765));
        System.out.println(ovr.sub(987654321234567.9876543,87654398));
        System.out.println(ovr.sub(876543456.876f,-987654.87654f));
        System.out.println(ovr.sub(98765432345678.98765432234567, 987654.9876f));
        System.out.println(ovr.sub(-876543212345678987654334567.87658, 987654323456789987654.956));
        System.out.println("Multiply method: ");
        System.out.println(ovr.multiply(23,87));
        System.out.println(ovr.multiply(763.87f,87643));
        System.out.println(ovr.multiply(987654367.726,65432345));
        System.out.println(ovr.multiply(8765432.9876,8765.876f));
        System.out.println(ovr.multiply(987.987f,8754.876f));
        System.out.println(ovr.multiply(123456789.3456789,56789234.87));
        System.out.println("Div method: ");
        System.out.println(ovr.div(23,4));
        System.out.println(ovr.div(765.76f,76));
        System.out.println(ovr.div(876543234567.92,76543));
        System.out.println(ovr.div(876543.987654f,765.75f));
        System.out.println(ovr.div(98765432234567.82345,76.8f));
        System.out.println(ovr.div(876543289.987,9876532.98));
        System.out.println("ABS method: ");
        System.out.println(ovr.abs(-65));
        System.out.println(ovr.abs(-8765.876f));
        System.out.println(ovr.abs(-8765423456.765));
        System.out.println("Pow method: ");
        System.out.println(ovr.pow(76));
        System.out.println(ovr.pow(-765.876f));
        System.out.println(ovr.pow(98765436.8765));


    }
}