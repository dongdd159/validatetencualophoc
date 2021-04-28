public class ClassNameExampleTest {
    private static ClassNameExample classNameExample;
    public static final String[] validClassName = new String[] { "C0318G" };
    public static final String[] invalidClassName = new String[] { "M0318G", "P0323A"};

    public static void main(String args[]) {
        classNameExample = new ClassNameExample();
        for (String classname : validClassName) {
            boolean isvalid = classNameExample.validate(classname);
            System.out.println("Classname is " + classname +" is valid: "+ isvalid);
        }
        for (String classname : invalidClassName) {
            boolean isvalid = classNameExample.validate(classname);
            System.out.println("Classname is " + classname +" is valid: "+ isvalid);
        }
    }
}
