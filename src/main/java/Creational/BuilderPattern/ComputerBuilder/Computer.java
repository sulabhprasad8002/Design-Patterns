package Creational.BuilderPattern.ComputerBuilder;

public class Computer {
    private String cpu;

    private int ram;
    private int storage;
    private boolean hasGPU;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public boolean isHasGPU() {
        return hasGPU;
    }

    public void setHasGPU(boolean hasGPU) {
        this.hasGPU = hasGPU;
    }


    public Computer(String cpu, int ram, int storage, boolean hasGPU) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.hasGPU = hasGPU;
    }

    @Override
    public String toString() {
        return  "This computer has " + cpu + " cpu " + ram + " ram " + storage + " storage " + hasGPU + " gpu present";
    }
}
