/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OopProject;

/**
 *
 * @author MBG Traders
 */
class User {
    private int id ,contactno;
    private String firstname , lastname, address;

    public User() {
    }

    
    public User(int id, String firstname, String lastname, String address, int contactno) {
        this.id = id;
        this.contactno = contactno;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContactno() {
        return contactno;
    }

    public void setContactno(int contactno) {
        this.contactno = contactno;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   
    
}
