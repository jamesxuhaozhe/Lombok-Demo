import data.Account;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by haozhexu on 8/20/16.
 */
public class AccountTest {
    @Test
    public void testAccount() {
        Account account = new Account();
        account.setPassword("password");
        account.setUsername("username");
        String username = account.getUsername();
        username = "usernamechange";
        assertEquals("password", account.getPassword());
        assertEquals("username", account.getUsername());
    }
}
