package Creational.BuilderPattern.ComputerBuilder;

public class ComputerBuilderTestDrive {
    public static void main(String[] args) {
        GamingComputerBuilder computerBuilder = new GamingComputerBuilder();
        Computer gamingComputer = computerBuilder.setCpu("i11").
                                            setRam(128).
                                            setStorage(2048).
                                            setHasGpu(true).build();
        System.out.println(gamingComputer.toString());
    }
}
