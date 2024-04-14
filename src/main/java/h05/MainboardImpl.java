package h05;

public class MainboardImpl extends PurchasedComponent implements Mainboard {
    private CPU cpu;
    private Memory[] memories;
    private Peripheral[] peripherals;
    private Socket socket;
    private int nextMemorySlot = 0;
    private int nextPeripheralSlot = 0;

    /**
     * Constructs a new Mainboard with given parameters
     * @param socket actual cpu socket
     * @param numberOfMemorySlots max number of allowed memories
     * @param numberOfPeripheralSlots max number of allowed peripheral
     * @param price price of mainboard
     */
    public MainboardImpl (Socket socket, int numberOfMemorySlots, int numberOfPeripheralSlots, double price) {
        super(price);
        this.socket = socket;
        memories = new Memory[numberOfMemorySlots];
        peripherals = new Peripheral[numberOfPeripheralSlots];

    }

    /**
     * Adds a Cpu to the mainboard
     * @param cpu cpu, which gets added in the system
     * @return true if operation was successful, otherwise false
     */
    public boolean addCPU (CPU cpu) {
        if (cpu != null && this.cpu == null && cpu.getSocket() == socket) {
            this.cpu = cpu;
            return true;
        } else {
            return false;

        }
    }

    /**
     * Adds a memory to the mainboard
     * @param memory memory which gets added to the system
     * @return true if operation was successful, otherwise false
     */
    public boolean addMemory (Memory memory) {
        for (int i = 0; i < memories.length; i++) {
            if (memories[i] == null) {
                memories[i] = memory;
                nextMemorySlot++;
                return true;
            }
        }
        return false;
    }

    /**
     * Adds a peripheral to the mainboard
     * @param peripheral peripheral which gets added to the system
     * @return true if operation was successful, otherwise false
     */
    public boolean addPeripheral (Peripheral peripheral) {
        for (int i = 0; i < peripherals.length; i++) {
            if (peripherals[i] == null) {
                peripherals[i] = peripheral;
                nextPeripheralSlot++;
                return true;
            }
        }
        return false;
    }

    @Override
    public void rateBy(ComponentRater rater) {
        rater.consumeMainboard(this);

        if(cpu != null) {
            rater.consumeCPU(cpu);
        }

        for(int i = 0; i < nextMemorySlot; i++){
            rater.consumeMemory(memories[i]);
        }

        for(int i = 0; i < nextPeripheralSlot; i++){
            rater.consumePeripheral(peripherals[i]);
        }
    }
}
