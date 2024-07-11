public class MathFunctions {

    public int add(int a, int b){
        return a + b;
    }
    public int sub(int a, int b){
        return a - b;
    }
    public int multiply(int a, int b){
        return a * b;
    }
    public int div(int a, int b){
        return a / b;
    }
    public int abs(int a){
        return Math.abs(a);
    }
    public int pow(int a){
        return a * a;
    }


    public static void main(String[] args) {
        MathFunctions mathFunctions = new MathFunctions();
        System.out.println(mathFunctions.add(1, 2));
        System.out.println(mathFunctions.sub(4, 3));
        System.out.println(mathFunctions.multiply(5, 6));
        System.out.println(mathFunctions.div(8, 2));
        System.out.println(mathFunctions.abs(10));
        System.out.println(mathFunctions.pow(9));
    }
}
