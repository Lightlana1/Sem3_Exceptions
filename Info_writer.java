package Sem3;
// метод записи данных в файл
import java.io.FileWriter;
import java.io.IOException;

public class Info_writer {
    public static void info_writer(People_info person){
        // присвоение название файла по фамилии
        String fileSurname = person.getSurname() + ".txt";


        try(FileWriter writer = new FileWriter(fileSurname, true))
        {
            writer.append(person.toString());
            writer.append('\n');

            writer.flush();
            writer.close();
            System.out.println("Данные записаны");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
