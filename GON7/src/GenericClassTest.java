public class GenericClassTest {
    public static void main(String args[]) {
        // Create an object for GenericClass storing Integer values.
        GenericClass<Integer> iOb = new GenericClass<Integer>(88);
        iOb.showType();
        // No need for type casting
        int v = iOb.getob();
        System.out.println("Value: " + v);

        // Create an object for GenericClass storing String values.
        GenericClass<String> strOb = new GenericClass<String>("Generics Test");
        strOb.showType();
                String str = strOb.getob();
        System.out.println("Value: " + str);
    }
}