
// participant: Subsystem

public class MemorySubsystem {
    
    private int capacity;
    
    public MemorySubsystem() {
        this.capacity = 0;
    }
    
    public void config(int capacity) {
        this.capacity = capacity;
    }
    
    public String getDescription() {
        String description;
        switch (capacity) {
            case 1: description = "(1GB RAM)"; break;
            case 2: description = "(2GB RAM)"; break;
            case 3: description = "(4GB RAM)"; break;
            default: description = "(128MB RAM)";
        }
        return description;
    }
    
}
