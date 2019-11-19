package com.datastructure.niranjan;

import java.util.Objects;

public class Employee {
    String name;
    String mobile;
    String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
       else {
           return ((Employee) o).getName()==this.name && ((Employee) o).mobile==this.mobile && ((Employee) o).email==this.email;
        }
    }

    @Override
    public int hashCode() {
        int Hascode=1;
        Hascode =Hascode+ 31*name.hashCode();
        Hascode = Hascode+31*email.hashCode();
        Hascode = Hascode+31*mobile.hashCode();
        return Hascode;


        //return Objects.hash(getName(), getMobile(), getEmail());
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public Employee(String name, String mobile, String email) {
        this.name = name;
        this.mobile = mobile;
        this.email = email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
