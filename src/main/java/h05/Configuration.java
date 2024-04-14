package h05;

public interface Configuration {
    /**
     * Rates the system given a specific {@link ComponentRater}
     * @param rater specific {@link  ComponentRater}
     */
    public void rateBy(ComponentRater rater);
}
