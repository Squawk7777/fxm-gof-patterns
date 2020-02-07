package net.mgvyshinskiy.designpatterns.gof.templatemethod.writers;

import java.io.FileOutputStream;
import java.io.IOException;

abstract class AbstractFileWriter {
    abstract protected void writeData(FileOutputStream outputStream) throws IOException;

    public void writeFile(String fileName) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(fileName);
        writeData(outputStream);
        outputStream.close();
    }
}
