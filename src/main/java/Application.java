import configuration.AppConfiguration;
import model.LEinOC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repository.LEinOCRepository;
import service.TestService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        TestService testService = context.getBean(TestService.class);

        List<LEinOC> list = testService.findById(1);
        for (LEinOC lEinOC : list) {
            System.out.println(lEinOC.toString());
        }

    }
}
