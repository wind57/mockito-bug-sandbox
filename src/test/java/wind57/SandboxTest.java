package wind57;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class SandboxTest {

    static {
        System.setProperty("net.bytebuddy.dump", "/some/path/here");
    }

    private final Sandbox underTest = Mockito.mock(Sandbox.class);

    @Test
    public void go() {
        //Assertions.assertFalse(underTest.go());
        try {
            Class.forName(Sandbox.class.getName(), true, Sandbox.class.getClassLoader());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
