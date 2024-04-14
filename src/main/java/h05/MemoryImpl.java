package h05;

public class MemoryImpl extends PurchasedComponent implements Memory {
    private final char capacity;

    /**
     * Constructs a new memory with given parameters
     * @param capacity Capacity of the memory in Gigabyte
     * @param price Price of the memory
     */
    public MemoryImpl(char capacity, double price) {
        super(price);
        this.capacity = capacity;
    }
    @Override
    public char getCapacity() {
        return capacity;
    }
}
