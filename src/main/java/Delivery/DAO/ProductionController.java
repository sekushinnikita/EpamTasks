package Delivery.DAO;

import Delivery.Entities.Production;

public class ProductionController extends Controller<Production> {
    private static final String dir = "data/production.dat";

    @Override
    public String getDirectory() {
        return dir;
    }
}

