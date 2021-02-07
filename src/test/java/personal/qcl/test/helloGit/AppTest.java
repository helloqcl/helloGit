package personal.qcl.test.helloGit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void dailyPractice() {
        int a = 23;
        int b = 1242;
        final String s = "12123";
        final String s1 = "21313dasdad";
        final String s2 = "sdadadweq";
        final String s3 = "asdad";
        final ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(s);
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s);
        //a>b.if
        if (a > b) {
            System.out.println("a>b");
        } else {
            System.out.println("a<b");
        }
        if (s != null) {
            System.out.println("s!=null");
        }

        //arraylist.for
        System.out.println("---------------------------------");
        for (String string1 : arrayList) {
            System.out.println(string1);
        }
        System.out.println("---------------------------------");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("---------------------------------");
        for (int j = arrayList.size() - 1; j >= 0; j--) {
            System.out.println(arrayList.get(j));
        }
    }
}
