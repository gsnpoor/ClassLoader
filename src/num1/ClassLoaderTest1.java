package num1;

public class ClassLoaderTest1 {
    public static void main(String[] args) {
        System.out.println(ClassLoaderTest1.class.getClassLoader());
        System.out.println(ClassLoaderTest1.class.getClassLoader().getClass().getClassLoader());
        System.out.println(ClassLoaderTest1.class.getClassLoader().getParent());
        System.out.println(String.class.getClassLoader());
    }
}
