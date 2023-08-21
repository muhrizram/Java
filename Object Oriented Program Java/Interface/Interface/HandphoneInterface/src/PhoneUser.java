import interfaces.Phone;

public class PhoneUser {
    private Phone phone;

    public PhoneUser() {
        super();
    }

    public PhoneUser(Phone phone) {
        super();
        this.phone = phone;
    }

    public void turnOnThePhone() {
        this.phone.powerOn();
    }

    public void turnOffThePhone() {
        this.phone.powerOff();
    }

    public void makePhoneLouder() {
        this.phone.volumeUp();
    }

    public void makePhoneSilent() {
        this.phone.volumeDown();
    }

    // Getter & Setter Phone
    public Phone getPhone() {
        return this.phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

}
