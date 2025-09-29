import java.io.OutputStream;
import java.net.Socket;

public class test {
    public static void main(String[] args) {
        while (true) {
            try (Socket socket = new Socket("localhost", 25585)) {
                OutputStream out = socket.getOutputStream();
                out.write("Hello, server!\n".getBytes());
                out.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
