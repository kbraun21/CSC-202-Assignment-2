package hospital;

/**
 * Created by kristab21 on 7/20/16.
 */

public class Hospital implements Comparable<Hospital> {

    private String name;
    private String address;
    private String location;
    private String phone;
    private String image;

    public Hospital(String name, String phone, String address, String location, String image) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.location = location;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
