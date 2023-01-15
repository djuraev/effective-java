package src.item9;

import java.io.BufferedReader;
import java.io.FileReader;

/**
  try (resource declaration) {
    // use of the resource
  } catch (ExceptionType e1) {
    // catch block
  }
 */
public class Main {

    public static void main(String[] args) {
        String line;
        try (BufferedReader bfr = new BufferedReader(new FileReader(""))) {
            while ((line = bfr.readLine()) != null) {
                System.out.println("Read line: "+line);
            }
        }
        catch(Exception exception) {
            exception.printStackTrace();
            Throwable[] sp = exception.getSuppressed();
            for (Throwable th: sp) {
                System.out.println("SP => "+th);
            }
        }
    }
}
