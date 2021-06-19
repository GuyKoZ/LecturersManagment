public class Main {
    public static void main(String[] args){
        Lecturer test = new SeniorLecturer( "guy", "Cyebr", 4, 3);
        test.introduce();
        test.greet();
        System.out.println();

        Lecturer ms = new Professor( "Ron", "JAVA", 5, 3, 15);
        ms.introduce();
        ms.greet();
        System.out.println();

        Lecturer mse = new DeptChair( "Ron", "JAVA", 10, 5, 100, 1999);
        mse.introduce();
        mse.greet();
        System.out.println();

    }
}
