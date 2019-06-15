import com.itheima.ssm.dao.OrdersMapper;
import com.itheima.ssm.dao.ProductMapper;
import com.itheima.ssm.domain.Orders;
import com.itheima.ssm.domain.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    @org.junit.Test
    public void test() throws Exception {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext_dao.xml");
        ProductMapper bean = app.getBean(ProductMapper.class);
        List<Product> all = bean.findAll();
        for (Product product : all) {
            System.out.println(product);
        }
    }

    @org.junit.Test
    public void test1() throws Exception {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext_dao.xml");
        OrdersMapper bean = app.getBean(OrdersMapper.class);
        List<Orders> all = bean.findAll();
        for (Orders o : all) {
            System.out.println(o);
        }
    }
}
