package h05;

public class TotalCostRater implements ComponentRater {
    private double cost;

    @Override
    public void consumeMainboard(Mainboard mainboard) {
        cost += mainboard.getPrice();
    }

    @Override
    public void consumeCPU(CPU cpu) {
        cost += cpu.getPrice();
    }

    @Override
    public void consumeMemory(Memory memory) {
        cost += memory.getPrice();
    }

    @Override
    public void consumePeripheral(Peripheral peripheral) {
        cost += peripheral.getPrice();
    }

    /**
     *
     * @return the total cost of the system
     */
    public double getTotalPrice() {
        return cost;
    }
}
