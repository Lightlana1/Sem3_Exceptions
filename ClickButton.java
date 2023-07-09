package Sem3;
// метод для запуска программы

import static Sem3.Parsing.parsArr;
import static Sem3.User_input.userInput;

public class ClickButton {
    public static void clickButton(){
        String info = userInput("Введите данные через пробел: Фамилия Имя Отчество датарождения(формат dd.mm.yyyy)" +
                " номертелефона(формат 79775105255) пол(поставьте f или m)");

        parsArr(info);


    }
}
