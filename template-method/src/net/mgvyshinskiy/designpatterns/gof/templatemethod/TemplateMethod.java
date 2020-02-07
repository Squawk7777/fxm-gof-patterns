package net.mgvyshinskiy.designpatterns.gof.templatemethod;

import net.mgvyshinskiy.designpatterns.gof.templatemethod.writers.DateFileWriter;
import net.mgvyshinskiy.designpatterns.gof.templatemethod.writers.TimeFileWriter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TemplateMethod {
    public static void main(String[] args) throws IOException {
        String fileWithDate = "date.txt";
        String fileWithTime = "time.txt";

        DateFileWriter dateFileWriter = new DateFileWriter();
        TimeFileWriter timeFileWriter = new TimeFileWriter();

        dateFileWriter.writeFile(fileWithDate);
        timeFileWriter.writeFile(fileWithTime);

        System.out.println(new String(Files.readAllBytes(Paths.get(fileWithDate))));
        System.out.println(new String(Files.readAllBytes(Paths.get(fileWithTime))));
    }
}
