import jdk.dynalink.Operation;

public class Main {
    private static Main.OperationEntiere OperationEntiere;

    @FunctionalInterface
    interface OperationEntiere {
        int calculer(int x, int y);
    }
    //q1
    public static OperationEntiere ADD = (x, y) -> x + y;
    public static OperationEntiere SUB = (x, y) -> x - y;
    public static OperationEntiere MUL = (x, y) -> x * y;
    public static OperationEntiere DIV = (x, y) -> x / y;

    //q2
    public abstract class Calculator implements OperationEntiere {
        /*
        public static OperationEntiere add_ = (x, y) -> x + y;
        public static OperationEntiere sub_ = (x, y) -> x - y;
        public static OperationEntiere mul_ = (x, y) -> x * y;
        public static OperationEntiere div_ = (x, y) -> x / y;

         */
        public static int operation(int x, int y, OperationEntiere calcule){return calcule.calculer(x, y);}
    }

    public static void main(String[] args) {
        System.out.println("Hello main!");
        int t1 = 1;
        int t2 = 2;
        //testQ1
        System.out.println(ADD.calculer(t1, t2));
        System.out.println(SUB.calculer(t1, t2));
        System.out.println(MUL.calculer(t1, t2));
        System.out.println(DIV.calculer(t1, t2));

        //testQ2
        /*
        System.out.println(Calculator.add_.calculer(t1, t2));
        System.out.println(Calculator.sub_.calculer(t1, t2));
        System.out.println(Calculator.mul_.calculer(t1, t2));
        System.out.println(Calculator.div_.calculer(t1, t2));
        */
        System.out.println(Calculator.operation(t1, t2, (x, y) -> x + y));
        System.out.println(Calculator.operation(t1, t2, (x, y) -> x - y));
        System.out.println(Calculator.operation(t1, t2, (x, y) -> x * y));
        System.out.println(Calculator.operation(t1, t2, (x, y) -> x / y));
    }
}

