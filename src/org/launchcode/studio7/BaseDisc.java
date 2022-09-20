package org.launchcode.studio7;

public abstract class BaseDisc {

    protected String name;
    protected double storageCapacity;
    protected String RPM;

    public BaseDisc(String name, double storageCapacity, String RPM) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.RPM = RPM;
    }
}
