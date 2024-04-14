package h05;

public interface CPU extends Component {
    /**
     *
     * @return the socket of the processor
     */
    public Socket getSocket();
    /**
     *
     * @return the number of cores inside the processor
     */
    public int getNumberOfCores();
    /**
     *
     * @return the frequency of the cpu in Hertz
     */
    public double getFrequency();
}
