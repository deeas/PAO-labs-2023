package pao.laborator6.files;

import pao.laborator6.files.exceptions.FileWritingException;

import java.io.*;

public class WriteToFileService {
    /**
     * ByteStreams - flux cu prelucrare la nivel de octet (8 biti).
     *
     * @throws FileWritingException
     */
    public static void writeUsingFileOutputStream(String text) throws FileWritingException {
        try (FileOutputStream out = new FileOutputStream("output.txt")) {
            out.write(text.getBytes());
        } catch (IOException e) {
            throw new FileWritingException("Something went wrong in writeUsingFileOutputStream method", e);
        }
    }

    /**
     * Character Streams - flux cu prelucrare la nivel de caracter, pe 16 biti.
     *
     * @throws FileReadingException
     */
    public static void writeUsingFileWriter(String text) throws FileWritingException {
        try (FileWriter fileWriter = new FileWriter("output.txt")) {
            fileWriter.append(text);
        } catch (IOException e) {
            throw new FileWritingException("Something went wrong in writeUsingFileWriter method", e);
        }
    }

    /**
     * DataInputStream & DataOutputStream: fluxuri de procesare; citirea si scrierea datelor la nivel de tip primitiv.
     * Fluxul procesat nu mai este interpretat la nivel de octet, ci octetii sunt grupati astfel incat sa reprezinte
     * date primitive sau siruri de caractere (String).
     * <p>
     * DataOutputStream constructor primeste OutputStream ca param.
     *
     * @throws FileWritingException
     */
    public static void writeUsingDataOutputStream(String text) throws FileWritingException {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("output.txt"))) {
            dataOutputStream.writeUTF(text); // writeBoolean, writeInt, writeDouble, etc
        } catch (IOException e) {
            throw new FileWritingException("Something went wrong in writeUsingDataOutputStream method", e);
        }
    }

    /**
     * BufferedInputStream & BufferedOutputStream: flux de procesare la nivel de buffer de octeti.
     * Citirea la nivel de caracter/octet e costisitoare dpdv IO asa ca a trebuit sa se gaseasca o solutie mai eficienta.
     * Dimensiune implicita buffer: 512 octeti.
     * <p>
     * BufferedOutputStream constructor primeste OutputStream ca param.
     *
     * @throws FileWritingException
     */
    public static void writeUsingBufferedOutputStream(String text) throws FileWritingException {
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
                new FileOutputStream("output.txt"))) {
            bufferedOutputStream.write(text.getBytes());
        } catch (IOException e) {
            throw new FileWritingException("Something went wrong in writeUsingBufferedOutputStream method", e);
        }
    }

    /**
     * BufferedReader & BufferedWriter: flux de procesare la nivel de buffer de caractere.
     *
     * @throws FileWritingException
     */
    public static void writeUsingBufferedWriter(String text) throws FileWritingException {
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter("output.txt"))) {
            buffer.write(text);
        } catch (IOException e) {
            throw new FileWritingException("Something went wrong in writeUsingBufferedWriter method", e);
        }
    }
}
