/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author K . AGYENIM-BOATENG
 */
public class RegisterVehicle {
        private String name;
        private String address;
        private String postcode;
        private String phonenumber;
        private String email;
        private String carid;
        private String mileageid;

    public RegisterVehicle(String name, String address, String postcode, String phonenumber, String email, String carid, String mileageid) {
        this.name = name;
        this.address = address;
        this.postcode = postcode;
        this.phonenumber = phonenumber;
        this.email = email;
        this.carid = carid;
        this.mileageid = mileageid;
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

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid;
    }

    public String getMileageid() {
        return mileageid;
    }

    public void setMileageid(String mileageid) {
        this.mileageid = mileageid;
    }
        
}
