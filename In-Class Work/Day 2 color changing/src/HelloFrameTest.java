import javax.swing.JFrame;

public class HelloFrameTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Am I Doing This Right?");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String message = (args.length == 0 ? "this is cool" : args[0]);
        HelloComponent label = new HelloComponent(message);
        frame.add(label);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
