
// participant: Facade
public class ComputerFacade {

    private final CPUSubsystem cpu;
    private final MemorySubsystem memory;
    private final MonitorSubsystem monitor;

    public ComputerFacade() {
        cpu = new CPUSubsystem();
        memory = new MemorySubsystem();
        monitor = new MonitorSubsystem();
    }

    public String getLowEndComputer() {
        cpu.config(1);
        memory.config(1);
        monitor.config(1);
        return "Low-end Computer: " + cpu.getDescription()
                + memory.getDescription() + monitor.getDescription();
    }

    public String getHotSaleComputer() {
        cpu.config(2);
        memory.config(2);
        monitor.config(2);
        return "Hot Sale Computer: " + cpu.getDescription()
                + memory.getDescription() + monitor.getDescription();
    }

    public String getHighPerformanceComputer() {
        cpu.config(3);
        memory.config(3);
        monitor.config(3);
        return "High Performance Computer: " + cpu.getDescription()
                + memory.getDescription() + monitor.getDescription();
    }
}
