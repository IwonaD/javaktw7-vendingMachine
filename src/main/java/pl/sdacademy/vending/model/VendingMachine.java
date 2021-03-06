package pl.sdacademy.vending.model;

import pl.sdacademy.vending.util.Configuration;


public class VendingMachine {
    public final Configuration configuration;

    public VendingMachine(Configuration configuration){
        this.configuration = configuration;


    }



    public Long rowsSize() {
        return configuration.getProperty("machine.size.rows", 6L);
    }

    public Long colSize() {
        return configuration.getProperty("machine.size.cols",4L);
    }
}
