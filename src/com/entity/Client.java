package com.entity;

/**
 * @autor : WL;
 * @date : 2019/3/26 0026
 */
public class Client {
    private int clientId;
    private String name;
    private String sex;
    private int age;
    private String idNumber;
    private String email;
    private String tel;
    private String driveNumber;
    private String driveType;
    private String address;
    private int integral;

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", idNumber='" + idNumber + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", driveNumber='" + driveNumber + '\'' +
                ", driveType='" + driveType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Client(int clientId, String name, String sex, int age, String idNumber, String email, String tel, String driveNumber, String driveType, String address) {
        this.clientId = clientId;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.idNumber = idNumber;
        this.email = email;
        this.tel = tel;
        this.driveNumber = driveNumber;
        this.driveType = driveType;
        this.address = address;
    }
    public Client(String name, String sex, int age, String idNumber, String email, String tel, String driveNumber, String driveType, String address) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.idNumber = idNumber;
        this.email = email;
        this.tel = tel;
        this.driveNumber = driveNumber;
        this.driveType = driveType;
        this.address = address;
    }


    public Client() {
    }

    public int getClientId() {
        return clientId;
    }

    public void setClient_Id(int clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setId_Number(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDriveNumber() {
        return driveNumber;
    }

    public void setDrive_Number(String driveNumber) {
        this.driveNumber = driveNumber;
    }

    public String getDriveType() {
        return driveType;
    }

    public void setDrive_Type(String driveType) {
        this.driveType = driveType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
