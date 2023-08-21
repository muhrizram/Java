package interfaces;
public interface Phone {
    // Constant Field/Attribute
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    // Abstract Method
    void powerOn();

    void powerOff();

    void volumeUp();

    void volumeDown();
}
