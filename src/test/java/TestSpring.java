import com.kou.domain.Account;
import com.kou.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author JIAJUN KOU
 */
public class TestSpring {

    @Test
    public void run1(){
        //加载配置文件
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        IAccountService as=(IAccountService) ac.getBean("accountService");
        //调用方法
        as.findAll();
    }
}
