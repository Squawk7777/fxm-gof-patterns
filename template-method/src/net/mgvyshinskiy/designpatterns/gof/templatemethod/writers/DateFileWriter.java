package net.mgvyshinskiy.designpatterns.gof.templatemethod.writers;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;

public class DateFileWriter extends AbstractFileWriter {
    @Override
    protected void writeData(FileOutputStream outputStream) throws IOException {
        outputStream.write(LocalDate.now().toString().getBytes());
    }
}
