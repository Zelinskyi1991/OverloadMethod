/**
 * Created by werwolf on 08.05.15.
 */
//Overload method
    class OverloadMethod {
    void test() {
        System.out.println("No parameter");
    }

    //Overload method test with one int parameter
    void test(int a) {
        System.out.println("a & b: " + a);
    }

    //Overload method test with one int
    void test(int a, int b) {
        System.out.println("a & b" + a + " " + b);

    }

    //Overload method test with double parameter
    double test(double a) {
        System.out.println("Real double precision");
        return a * a;
    }

}

class Overload {
    public static void main(String[] args) {
        OverloadMethod ob = new OverloadMethod();
        double result;
// All version of Test()
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test (123.2);
        System.out.println("Result ob.test (123.2): " + result);

        }
    }
