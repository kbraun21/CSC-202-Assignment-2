package model;

import java.io.Serializable;

/**
 * Created by kristab21 on 6/29/16.
 */

public class User extends Person implements Serializable, Comparable<User> {
    private String uname;
    private String email;
    private String phone;
    private String password;
    private String photo;

    public User(String uname, String password) {
        this.uname = uname;
        this.password = password;
    }

    public User(String uname, String email, String phone, String password, String photo) {
        this.uname = uname;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.photo = photo;
    }

    public User(String firstName, String lastName, String dob, String gender, String uname, String email, String phone, String password, String photo) {
        super(firstName, lastName, dob, gender);
        this.uname = uname;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.photo = photo;
    }

    public String getuname() {
        return uname;
    }

    public void setuname(String userName) {
        this.uname = uname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean equals (User user) {
        return(this.uname.equals(user.uname)); }

    @Override /* override not required but used to double check method*/
    public int compareTo(User user) {
        return (this.uname.compareTo(user.uname));
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + uname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }


}
