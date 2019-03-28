package com.entity;

/**
 * @autor : WL;
 * @date : 2019/3/26 0026
 */
public class Cars {
    private int carId;
    private String carName;
    private int gradeId;
    private int isImage;
    private String imageUrl;
    private int dailyRent;
    private int monthRent;
    private int num;
    private String context;

    public Cars(String carName, int gradeId, int isImage, String imageUrl, int dailyRent, int monthRent, int num, String context) {
        this.carName = carName;
        this.gradeId = gradeId;
        this.isImage = isImage;
        this.imageUrl = imageUrl;
        this.dailyRent = dailyRent;
        this.monthRent = monthRent;
        this.num = num;
        this.context = context;
    }

    public Cars(int carId, String carName, int gradeId, int isImage, String imageUrl, int dailyRent, int monthRent, int num, String context) {
        this.carId = carId;
        this.carName = carName;
        this.gradeId = gradeId;
        this.isImage = isImage;
        this.imageUrl = imageUrl;
        this.dailyRent = dailyRent;
        this.monthRent = monthRent;
        this.num = num;
        this.context = context;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "carId=" + carId +
                ", carName='" + carName + '\'' +
                ", gradeId=" + gradeId +
                ", isImage=" + isImage +
                ", imageUrl='" + imageUrl + '\'' +
                ", dailyRent=" + dailyRent +
                ", monthRent=" + monthRent +
                ", num=" + num +
                ", context='" + context + '\'' +
                '}';
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getGradeId() {
        return gradeId;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    public int getIsImage() {
        return isImage;
    }

    public void setIsImage(int isImage) {
        this.isImage = isImage;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getDailyRent() {
        return dailyRent;
    }

    public void setDailyRent(int dailyRent) {
        this.dailyRent = dailyRent;
    }

    public int getMonthRent() {
        return monthRent;
    }

    public void setMonthRent(int monthRent) {
        this.monthRent = monthRent;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Cars() {
    }

    
}
