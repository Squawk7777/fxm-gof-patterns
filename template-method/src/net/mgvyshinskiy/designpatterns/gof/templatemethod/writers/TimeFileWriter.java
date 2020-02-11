package net.mgvyshinskiy.designpatterns.gof.templatemethod.writers;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalTime;

public class TimeFileWriter extends AbstractFileWriter {
    @Override
    protected void writeData(FileOutputStream outputStream) throws IOException {
        outputStream.write(LocalTime.now().toString().getBytes());
    }
}
