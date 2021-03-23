package com.yiming.springboot.entity;

public class Student {
    private String 学号;

    private String 姓名;

    private String 语文成绩;

    private String 数学成绩;

    private String 英语成绩;

    private String 物理成绩;

    private String 化学成绩;

    private String 生物成绩;
    private String 总成绩;

    public Student(String 学号, String 姓名, String 总成绩) {
        this.学号 = 学号;
        this.姓名 = 姓名;
        this.总成绩 = 总成绩;
    }

    public String get总成绩() {
        return 总成绩;
    }

    public void set总成绩(String 总成绩) {
        this.总成绩 = 总成绩;
    }

    public String get学号() {
        return 学号;
    }

    public void set学号(String 学号) {
        this.学号 = 学号 == null ? null : 学号.trim();
    }

    public String get姓名() {
        return 姓名;
    }

    public void set姓名(String 姓名) {
        this.姓名 = 姓名 == null ? null : 姓名.trim();
    }

    public String get语文成绩() {
        return 语文成绩;
    }

    public void set语文成绩(String 语文成绩) {
        this.语文成绩 = 语文成绩 == null ? null : 语文成绩.trim();
    }

    public String get数学成绩() {
        return 数学成绩;
    }

    public void set数学成绩(String 数学成绩) {
        this.数学成绩 = 数学成绩 == null ? null : 数学成绩.trim();
    }

    public String get英语成绩() {
        return 英语成绩;
    }

    public void set英语成绩(String 英语成绩) {
        this.英语成绩 = 英语成绩 == null ? null : 英语成绩.trim();
    }

    public String get物理成绩() {
        return 物理成绩;
    }

    @Override
    public String toString() {
        return "Student{" +
                "学号='" + 学号 + '\'' +
                ", 姓名='" + 姓名 + '\'' +
                ", 语文成绩='" + 语文成绩 + '\'' +
                ", 数学成绩='" + 数学成绩 + '\'' +
                ", 英语成绩='" + 英语成绩 + '\'' +
                ", 物理成绩='" + 物理成绩 + '\'' +
                ", 化学成绩='" + 化学成绩 + '\'' +
                ", 生物成绩='" + 生物成绩 + '\'' +
                ", 总成绩='" + 总成绩 + '\'' +
                '}';
    }

    public void set物理成绩(String 物理成绩) {
        this.物理成绩 = 物理成绩 == null ? null : 物理成绩.trim();
    }

    public String get化学成绩() {
        return 化学成绩;
    }

    public void set化学成绩(String 化学成绩) {
        this.化学成绩 = 化学成绩 == null ? null : 化学成绩.trim();
    }

    public String get生物成绩() {
        return 生物成绩;
    }

    public void set生物成绩(String 生物成绩) {
        this.生物成绩 = 生物成绩 == null ? null : 生物成绩.trim();
    }

}