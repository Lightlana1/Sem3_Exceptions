package Sem3;

// методы парсинга и проверки форматов введенных данных
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import static Sem3.ClickButton.clickButton;

import static Sem3.Info_writer.info_writer;
import static Sem3.Only_letter.isOnlyLetter;
import static Sem3.User_input.userIntInput;


public class Parsing {
    public static void parsArr(String s) {
        String [] infoSplit = s.split(" ");
        ArrayList<String> infoList = new ArrayList<String>(Arrays.asList(infoSplit));
        int count = 0;
        int num = 0;
        ArrayList<String> fio = new ArrayList<String>();
        int countPerson = 0; // переменная для подсчёта валидных данных

        for(String info : infoList){
            count++;
        }

        People_info person = new People_info("0", "0","0",null,0, "0");

        // через count проверяем, что пользователь ввел все необходимые данные
        if (count == 6){

            //Ищем номер телефона
            for (String info: infoList){

                if (info.contains("8") && info.length() == 11){
                    try {
                        long tel = Long.parseLong(info);
                        person.setTel_number(tel);
                        countPerson = countPerson + 1;
                    }
                    catch (NumberFormatException e){
                        throw new RuntimeException(e);
                    }

                }

                // ищем дату рождения
                if(info.contains(".") && info.length() == 10){
                    String day = info;

                    SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
                    try {
                        Date parsedDate = formatter.parse(day);
                        person.setDate(parsedDate);
                        countPerson = countPerson + 1;
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                }

                if(info.equals("f") || info.equals("m")){
                    String gender = info;
                    person.setGender(gender);
                    countPerson = countPerson + 1;
                }

                if(isOnlyLetter(info) == true && info.length() > 1){
                    fio.add(info);
                    countPerson = countPerson + 1;
                }

            }

            if(countPerson < 6){
                System.out.println("Данные введены некорректно! Повторите ввод");
                num = userIntInput("Нажмите 1, чтобы повторить ввод. Чтобы выйти из консоли нажмите на любую клавишу");
                if (num == 1){
                    clickButton();
                }
                else {
                    System.out.println("Вы покинули программу");
                }


            }

        }
        else {
            System.out.println("Не хватает данных");
            num = userIntInput("Нажмите 1, чтобы повторить ввод. Чтобы выйти из консоли нажмите на любую клавишу");
            if (num == 1){
                clickButton();
            }
            else {
                System.out.println("Вы покинули программу");
            }
        }

        person.setSurname(fio.get(0));
        person.setName(fio.get(1));
        person.setM_name(fio.get(2));

        System.out.println(person.toString());


        info_writer(person);


        num = userIntInput("Нажмите 1, чтобы повторить ввод. Чтобы выйти из консоли нажмите на любую клавишу");
        if (num == 1){
            clickButton();
        }
        else {
            System.out.println("Вы покинули программу");
        }

    }
}
