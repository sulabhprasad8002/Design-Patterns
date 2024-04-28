package Creational.BuilderPattern.ComputerBuilder;

public interface ComputerBuilder {
    Computer build();
    ComputerBuilder setCpu(String cpu);
    ComputerBuilder setRam(int ram);
    ComputerBuilder setStorage(int storage);
    ComputerBuilder setHasGpu(boolean gpu);
}
