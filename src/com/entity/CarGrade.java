package com.entity;

/**
 * @autor : WL;
 * @date : 2019/3/26 0026
 */
public class CarGrade {
    private int gradeId;
    private String grade;

    @Override
    public String toString() {
        return "CarGrade{" +
                "gradeId=" + gradeId +
                ", grade='" + grade + '\'' +
                '}';
    }

    public int getGradeId() {
        return gradeId;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public CarGrade(int gradeId, String grade) {
        this.gradeId = gradeId;
        this.grade = grade;
    }

    public CarGrade(String grade) {
        this.grade = grade;
    }
}
