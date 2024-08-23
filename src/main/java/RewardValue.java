public class RewardValue {
    private static final double MILES_TO_CASH_RATE = 0.0035;

    private double cashValue;
    private double milesValue;

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE;
    }

    // Constructor for miles value
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * MILES_TO_CASH_RATE;
        } else {
            // Handle the case if isMiles is false
            throw new IllegalArgumentException("Invalid constructor argument");
        }
    }

    // Get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Get the miles value
    public double getMilesValue() {
        return milesValue;
    }
}
