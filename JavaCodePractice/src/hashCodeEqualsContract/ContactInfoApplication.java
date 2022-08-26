package hashCodeEqualsContract;

class ContactInfo {

    private int emplId;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String city;
    private String state;
    private int pin;

    public int getEmplId() {
        return emplId;
    }

    public void setEmplId(int emplId) {
        this.emplId = emplId;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println(getClass());
        System.out.println(obj.getClass());
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        System.out.println(this);
        if (obj == this) {
            return true;
        }

        ContactInfo ci = (ContactInfo) obj;
        return (emplId == ci.emplId);

    }

    @Override

    public int hashCode() {

        return emplId;


    }


}

public class ContactInfoApplication {

    public static void main(String[] args) {

        ContactInfo ci1 = new ContactInfo();
        ContactInfo ci2 = new ContactInfo();

        ci1.setEmplId(001);
        ci1.setAddressLine1("16th Main");
        ci1.setAddressLine2("Micco Layout");
        ci1.setAddressLine3("Hongasandra");
        ci1.setCity("Bangalore");
        ci1.setState("Karnataka");
        ci1.setPin(560068);


        ci2.setEmplId(001);
        ci2.setAddressLine1("16th Main");
        ci2.setAddressLine2("Micco Layout");
        ci2.setAddressLine3("Hongasandra");
        ci2.setCity("Bangalore");
        ci2.setState("Karnataka");
        ci2.setPin(560068);

        System.out.println(ci1.hashCode());
        System.out.println(ci2.hashCode());
        System.out.println(ci1.equals(ci2));



}

}
