import com.kou.dao.IAccountDao;
import com.kou.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author JIAJUN KOU
 */
public class testMybatis {
    /**
     * 查询用户的测试
     * @throws Exception
     */
    @Test
    public void run1() throws Exception {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        //获取到代理对象
        IAccountDao accountDao = session.getMapper(IAccountDao.class);
        List<Account> accounts = accountDao.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
        session.close();
        in.close();

    }

    /**
     * 保存方法测试
     * @throws Exception
     */
    @Test
    public void run2() throws Exception {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        //获取到代理对象
        IAccountDao accountDao = session.getMapper(IAccountDao.class);

        Account account=new Account();
        account.setName("嫔妃");
        account.setMoney(3200d);
        accountDao.saveAccount(account);
        //提交事务
        session.commit();
        run1();
        session.close();
        in.close();

    }
}
