package test;

import com.itheima.ssm.domain.Product;
import com.itheima.ssm.service.ProductService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ServiceTest {
    @Test
    public void test1() throws Exception {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext_service.xml");

        ProductService bean = app.getBean(ProductService.class);
        List<Product> all = bean.findAll();
        for (Product product : all) {
            System.out.println(product);
        }
    }
}
