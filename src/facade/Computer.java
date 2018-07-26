package facade;

public class Computer {
    public Computer() {
    }

    public void startComputer(){
        CPU cpu = new CPU();
        Disk disk = new Disk();
        Memory memory = new Memory();
        cpu.startCpu();
        disk.startDisk();
        memory.startMemory();
    }

    public void stopComputer(){
        CPU cpu = new CPU();
        Disk disk = new Disk();
        Memory memory = new Memory();
        cpu.stopCpu();
        disk.stopDisk();
        memory.stopMemory();
    }

}
