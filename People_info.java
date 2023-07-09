package Sem3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class People_info {
    private String surname;
    private String name;
    private String m_name;

    private Date date;
    private long tel_number;
    private String gender;

    public People_info(String surname, String name, String m_name, Date date, long tel_number, String gender) {
        this.surname = surname;
        this.name = name;
        this.m_name = m_name;
        this.tel_number = tel_number;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getTel_number() {
        return tel_number;
    }

    public void setTel_number(long tel_number) {
        this.tel_number = tel_number;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String printInform(){
        System.out.printf("Данные: %s, %s, %s, %d, %l, %s", surname, name, m_name, date, tel_number, gender);
        return ".";
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String sDate = sdf.format(date);

        return  surname + " " + name + " " + m_name + " " +
                "Дата рождения:" + sDate + " " +
                "Тел.:" + tel_number + " " +
                "пол:" + gender;
    }
}
