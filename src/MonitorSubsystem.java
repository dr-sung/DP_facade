
// participant: Subsystem

public class MonitorSubsystem {
    
    private int size;
    
    public MonitorSubsystem() {
        this.size = 0;
    }
    
    public void config(int size) {
        this.size = size;
    }
    
    public String getDescription() {
        String description;
        switch (size) {
            case 1: description = "(15in LCD)"; break;
            case 2: description = "(17in LCD)"; break;
            case 3: description = "(21in LCD)"; break;
            default: description = "(13in CRT)";
        }
        return description;
    }
    
}
