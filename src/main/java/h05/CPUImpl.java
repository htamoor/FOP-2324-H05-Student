package h05;

public class CPUImpl extends PurchasedComponent implements CPU {
    private final Socket socket;
    private final int numOfCores;
    private final double frequency;

    /**
     * Constructs a processor with given parameters
     * @param socket Specific socket of processor
     * @param numbOfCores the number of cores
     * @param frequency Clock frequency in Hertz
     * @param price price of the processor
     */
    public CPUImpl(Socket socket, int numbOfCores, double frequency, double price) {
        super(price);
        this.socket = socket;
        this.numOfCores = numbOfCores;
        this.frequency = frequency;
    }

    @Override
    public Socket getSocket() {
        return socket;
    }

    @Override
    public int getNumberOfCores() {
        return numOfCores;
    }
    @Override
    public double getFrequency() {
        return frequency;
    }
}
