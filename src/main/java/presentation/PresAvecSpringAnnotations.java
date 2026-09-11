package presentation;

import config.AppConfig;
import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresAvecSpringAnnotations {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            IMetier metier = context.getBean(IMetier.class);
            System.out.println("RESULT (Annotations): " + metier.calcul());
        }
    }
}
