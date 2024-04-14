package h05;

public interface Peripheral extends Component {
    /**
     * @return the actual type of the peripheral module
     */
    public PeripheralType getPeripheralType();
}
