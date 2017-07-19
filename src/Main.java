// Example: Facade design pattern
// (c) Dr. Hong K. Sung

// usng facade, it is easy to configure a computer system
// without knowing details of all subsystems

public class Main {
    
    public static void main(String[] args) {
        ComputerFacade facade = new ComputerFacade();
        
        String lowEndComputer = facade.getLowEndComputer();
        String hotSaleComputer = facade.getHotSaleComputer();
        String highPerformanceComputer = facade.getHighPerformanceComputer();
        
        System.out.println(lowEndComputer);
        System.out.println(hotSaleComputer);
        System.out.println(highPerformanceComputer);
    }
    
}
