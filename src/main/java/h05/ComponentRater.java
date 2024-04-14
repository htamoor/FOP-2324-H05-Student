package h05;

public interface ComponentRater {
    /**
     * Consumes a given mainboard
     * @param mainboard mainboard which gets rated
     */
    public void consumeMainboard(Mainboard mainboard);
    /**
     * Consume a given cpu
     * @param cpu cpu which gets rated
     */
    public void consumeCPU(CPU cpu);
    /**
     * Consume a given memory
     * @param memory memory which gets rated
     */
    public void consumeMemory(Memory memory);
    /**
     * Consume a given peripheral
     * @param peripheral peripheral which gets rated
     */
    public void consumePeripheral(Peripheral peripheral);
}
