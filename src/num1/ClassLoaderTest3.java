package num1;

import java.lang.ref.SoftReference;

public class ClassLoaderTest3 {
    public static void main(String[] args) {
        SoftReference a = new SoftReference(new String("nihao"));
        System.out.println(a.get());


    }
}
