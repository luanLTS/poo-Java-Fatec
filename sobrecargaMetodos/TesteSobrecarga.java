public class TesteSobrecarga {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        int a = 9, b = 10;
        int result = calc.soma(a, b);
        System.out.println(result);

        double b1 = 10.9, b2 = 19.2;
        double resultd = calc.soma(b1, b2);
        System.out.println(resultd);

        String s1 = "234";
        String s2 = "132";
        int resultS = calc.soma(s1, s2);
        System.out.println(resultS);

        int tres = calc.soma(1, 2, 3);
        System.out.println(tres);

        int intString = calc.soma(a, s1);
        System.out.println(intString);

        int stringInt = calc.soma(s1, a);
        System.out.println(stringInt);  
    }
}