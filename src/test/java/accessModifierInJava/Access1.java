package accessModifierInJava;

public class Access1 {


    public static void main(String[] args) {

        method2("red");



        Access2 a2 = new Access2();

        a2.mymethod("string");

        System.out.println(a2.integerr);

    }


    public static void method2(String apple) {
        System.out.println(apple);
    }


}
