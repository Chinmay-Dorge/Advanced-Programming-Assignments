public class Q1 {
    public static void main(String[] arg){
        Student s1 = new Student();
        s1.takeInput();
        s1.displayData();
        System.out.println();

        Student s2 = new Student();
        s2.takeInput();
        s2.displayData();
        System.out.println();

        Teacher t1 = new Teacher();
        t1.takeInput();
        t1.displayData();
        System.out.println();

        Teacher t2 = new Teacher();
        t2.takeInput();
        t2.displayData();
        System.out.println();

        Teacher.Science sci = t1.new Science();
        sci.takeInput();
        sci.displayData();

        Teacher.Commerce com = t1.new Commerce();
        com.takeInput();
        com.displayData();

        Teacher.Arts art = t2.new Arts();
        art.takeInput();
        art.displayData();

        Staff st1 = new Staff();
        st1.takeInput();
        st1.displayData();
        System.out.println();

    }
}