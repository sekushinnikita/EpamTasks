package Delivery.Service;

import Delivery.DAO.ProductionController;
import Delivery.Entities.Production;
import org.hibernate.service.spi.ServiceException;

import java.util.ArrayList;
import java.util.Objects;

public class ProductionService extends Service<Production> {
    private ProductionController productionController;

    public ProductionService() {
        productionController = new ProductionController();
        productionController.read();
    }

    public ArrayList<Production> getDAOdata() {
        return productionController.getData();
    }

    public ArrayList<Production> read() {
        return productionController.getData();
    }

    public boolean entityExist(Production production) {
        ArrayList<Production> arrProduction = getDAOdata();
        for (Production item : arrProduction) {
            if (Objects.equals(item,production)) {
                return true;
            }
        }
        return false;
    }

    public void create(Production production) {
        try {
            if (entityExist(production)) {
                throw new ServiceException("Error. This product already exists");
            } else {
                productionController.create(production);
                productionController.save();
            }
        } catch (ServiceException ex) {
        }

    }

    public void update(Production production, Production newProduction) {
        try {
            if (entityExist(production)) {
                productionController.update(production, newProduction);
                productionController.save();
            } else {
                throw new ServiceException("Error. This product doesn't exist");
            }
        } catch (ServiceException e) {
        }
    }

    public void delete(Production production) {
        try {
            if (entityExist(production)) {
                productionController.delete(production);
                productionController.save();
            } else {
                throw new ServiceException("Error. This product doesn't exist");
            }
        } catch (ServiceException e) {
        }
    }
}
