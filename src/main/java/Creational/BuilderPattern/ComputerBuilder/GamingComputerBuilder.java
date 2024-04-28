package Creational.BuilderPattern.ComputerBuilder;

public class GamingComputerBuilder implements ComputerBuilder{
    Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer("i9", 64, 1024, true);
    }

    @Override
    public ComputerBuilder setCpu(String cpu) {
        computer.setCpu(cpu);
        return this;
    }

    @Override
    public ComputerBuilder setRam(int ram) {
        computer.setRam(ram);
        return this;
    }

    @Override
    public ComputerBuilder setStorage(int storage) {
        computer.setStorage(storage);
        return this;
    }

    @Override
    public ComputerBuilder setHasGpu(boolean hasGpu) {
        computer.setHasGPU(hasGpu);
        return this;
    }

    @Override
    public Computer build() {
        return this.computer;
    }
}
