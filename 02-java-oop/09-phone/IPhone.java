public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        String ringing;
        ringing = "iPhone " + getVersionNumber() + "says " + getRingTone();
        return ringing;
    }
    @Override
    public String unlock() {
        String unlock;
        unlock = "Unlocking via facial recognition";
        return unlock;
    }
    @Override
    public void displayInfo() {
        System.out.println("iPhone " + getVersionNumber() + " from " + getCarrier());
    }
}