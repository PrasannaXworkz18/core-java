import com.xworkz.trainee.TraineeName;

public class Executor {
    public static void main(String[] args) {
        TraineeName ref = new TraineeName();
        ref.addName("ab");
        ref.addName("ab1");
        ref.addName("cd");
        ref.addName("Prasanna");

        ref.update("ab","cd");

        ref.onDelete("Prasanna");


    }
}
