import com.itcast.domain.Account;
import com.itcast.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sun.tools.java.ClassPath;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:springcore.xml")
public class TestMybatisSpring {
    @Autowired
    private AccountService accountService;
    @Test
    public void findAll() throws Exception{
        List<Account> account = accountService.findAll();
        for (Account account1 : account) {
            System.out.println(account1);

        }

    }
    @Test
    public void save() throws Exception{
        Account account = new Account();
        account.setId(12);
        account.setName("张三");
        account.setMoney(100f);
        accountService.save(account);
    }


}
