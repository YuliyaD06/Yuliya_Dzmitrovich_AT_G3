package main.java.tasks.lambda;
//- построчно прочитать файл и создать стрим из его строк, пропустив первые 4 строки собрать коллекцию в отдну строку,
// разделить на по <br>, оставить только те, что начинаются с "Date log:", в каждой строке оставить
// только первые 20 символов, к каждой в конец дописать значение текущей даты

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileStream {
    public static void main(String[] args) {
        String fileName = "/Users/Yuliya_Dzmitrovich/IdeaProjects/Test_Project/src/main/java/TestText.txt";
        File file = new File(fileName);

        try (Stream<String> linesStream = Files.lines(file.toPath())) {

            Arrays.stream(linesStream.skip(4).collect(Collectors.joining(" ")).split("<br>"))
                    .filter(string -> string.startsWith("Date log:")).limit(20).map(string -> string + LocalDate.now())
                            .collect(Collectors.toList()).forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
