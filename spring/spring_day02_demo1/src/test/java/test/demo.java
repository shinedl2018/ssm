package test;

import com.itcast.domain.Account;
import com.itcast.service.AccountService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class demo {
    private ApplicationContext ac;
    private AccountService accountService;

    @Before
    public void init(){
        ac = new ClassPathXmlApplicationContext("bean.xml");
        accountService = ac.getBean("accountService", AccountService.class);
    }
    @Test
    public void deleteById(){
        accountService.deleteById(3);

    }
    @Test
    public void findAll(){
        List<Account> list = accountService.findAll();
        for (Account account : list) {
            System.out.println(account);

        }
    }
    @Test
    public void save(){
        Account account = ac.getBean("account", Account.class);
        account.setId(23);
        account.setName("张三");
        account.setMoney(343);
        accountService.save(account);
    }
}
