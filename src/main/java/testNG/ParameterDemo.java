package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {

    @Test
    @Parameters({"username", "password"})
    public void loginTest(String user, String pass) {
        System.out.println("Username: " + user);
        System.out.println("Password: " + pass);
    }
}
