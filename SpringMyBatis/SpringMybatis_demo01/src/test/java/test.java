import com.itcast.domain.Account;
import com.itcast.mapper.AccountMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class test {
    public static void main(String[] args) throws Exception{
        InputStream is = Resources.getResourceAsStream("SqlConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();
        AccountMapper mapper = session.getMapper(AccountMapper.class);
        List<Account> list = mapper.findAll();
        for (Account account : list) {
            System.out.println(account);

        }

    }
}
