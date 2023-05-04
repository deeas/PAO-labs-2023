package pao.laborator6.files;

import pao.laborator6.files.exceptions.FileReadingException;

import java.io.*;

public class ReadFromFileService {
    /**
     * ByteStreams - flux cu prelucrare la nivel de octet (8 biti).
     *
     * @throws FileReadingException
     */
    public static void readUsingFileInputStream() throws FileReadingException {
        System.out.println("readUsingFileInputStream");

        // ex of try without resources
        try (FileInputStream in = new FileInputStream("output.txt")) {
            int c;
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            throw new FileReadingException("Something went wrong in readUsingFileInputStream method", e);
        }
        System.out.println();
    }

    /**
     * Character Streams - flux cu prelucrare la nivel de caracter, pe 16 biti.
     *
     * @throws FileReadingException
     */
    public static void readUsingFileReader() throws FileReadingException {
        System.out.println("readUsingFileReader");
        try (FileReader fileReader = new FileReader("output.txt")) {
            int content;
            while ((content = fileReader.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            throw new FileReadingException("Something went wrong in readUsingFileReader method", e);
        }
        System.out.println();
    }

    /**
     * DataInputStream & DataOutputStream: fluxuri de procesare; citirea si scrierea datelor la nivel de tip primitiv.
     * Fluxul procesat nu mai este interpretat la nivel de octet, ci octetii sunt grupati astfel incat sa reprezinte
     * date primitive sau siruri de caractere (String).
     * <p>
     * DataInputStream constructor primeste InputStream ca param.
     *
     * @throws FileReadingException
     */
    public static void readUsingDataInputStream() throws FileReadingException {
        System.out.println("readUsingDataInputStream");
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("output.txt"))) {
            while (dataInputStream.available() > 0) {
                String content = dataInputStream.readUTF(); // readInt, readChar, readDouble, readFloat, etc
                System.out.println(content);
            }
        } catch (IOException e) {
            throw new FileReadingException("Something went wrong in readUsingDataInputStream method", e);
        }
    }

    /**
     * BufferedInputStream & BufferedOutputStream: flux de procesare la nivel de buffer de octeti.
     * Citirea la nivel de caracter/octet e costisitoare dpdv IO asa ca a trebuit sa se gaseasca o solutie mai eficienta.
     * Dimensiune implicita buffer: 512 octeti.
     * <p>
     * BufferedInputStream constructor primeste InputStream ca param.
     *
     * @throws FileReadingException
     */
    public static void readUsingBufferedInputStream() throws FileReadingException {
        System.out.println("readUsingBufferedInputStream");
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(
                new FileInputStream("output.txt"))) {
            while (bufferedInputStream.available() > 0) {
                int read = bufferedInputStream.read();
                System.out.print((char) read);
            }
        } catch (IOException e) {
            throw new FileReadingException("Something went wrong in readUsingBufferedInputStream method", e);
        }
        System.out.println();
    }

    /**
     * BufferedReader & BufferedWriter: flux de procesare la nivel de buffer de caractere.
     *
     * @throws FileReadingException
     */
    public static void readUsingBufferedReader() throws FileReadingException {
        System.out.println("readUsingBufferedReader");
        try (BufferedReader buffer = new BufferedReader(new FileReader("output.txt"))) {
            String line = buffer.readLine();
            while (line != null) {
                System.out.println(line);
                line = buffer.readLine();
            }
        } catch (IOException e) {
            throw new FileReadingException("Something went wrong in readUsingBufferedReader method", e);
        }
    }

}
