package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresAvecSpringXML {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml")) {
            IMetier metier = context.getBean("metier", IMetier.class);
            System.out.println("RESULT (XML): " + metier.calcul());
        }
    }
}
