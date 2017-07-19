
// participant: Subsystem

public class CPUSubsystem {
    
    private int category;
    
    public CPUSubsystem() {
        category = 0;
    }
    
    public void config(int category) {
        this.category = category;
    }
    
    public String getDescription() {
        String description;
        switch (category) {
            case 1: description = "(Pentium i3 Core)"; break;
            case 2: description = "(Pentium i5 Core)"; break;
            case 3: description = "(Pentium i7 Core)"; break;
            default: description = "(CPU 386)";
        }
        return description;
    }
    
}
