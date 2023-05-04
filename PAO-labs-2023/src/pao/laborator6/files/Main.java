package pao.laborator6.files;

import pao.laborator6.files.exceptions.FileReadingException;
import pao.laborator6.files.exceptions.FileWritingException;

public class Main {
    public static void main(String[] args) throws FileWritingException, FileReadingException {
        WriteToFileService.writeUsingFileOutputStream("hello again");
        ReadFromFileService.readUsingFileInputStream();

        WriteToFileService.writeUsingFileWriter("hello again");
        ReadFromFileService.readUsingFileReader();

        WriteToFileService.writeUsingDataOutputStream("hello again");
        ReadFromFileService.readUsingDataInputStream();

        WriteToFileService.writeUsingBufferedOutputStream("hello again");
        ReadFromFileService.readUsingBufferedInputStream();

        WriteToFileService.writeUsingBufferedWriter("hello again");
        ReadFromFileService.readUsingBufferedReader();
    }
}
