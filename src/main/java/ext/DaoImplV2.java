package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("daoV2")
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Web service implementation");
        double temp = 11;
        return temp;
    }
}
