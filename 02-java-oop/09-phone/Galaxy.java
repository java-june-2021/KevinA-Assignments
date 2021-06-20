public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        String ringing;
        ringing = "Galaxy " + getVersionNumber() + "says " + getRingTone();
        return ringing;
    }
    @Override
    public String unlock() {
        String unlock;
        unlock = "Unlocking via finger print";
        return unlock;
    }
    @Override
    public void displayInfo() {
        System.out.println("Galaxy " + getVersionNumber() + " from " + getCarrier());
    }
}