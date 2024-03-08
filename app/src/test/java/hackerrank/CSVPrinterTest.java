package hackerrank;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.FileWriter;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.junit.jupiter.api.Test;

public class CSVPrinterTest {
    
    @Test
    void csvPrinterTest() {
        try (CSVPrinter csvPrinter = new CSVPrinter(new FileWriter("employee_data2.csv"), CSVFormat.DEFAULT)) {
            csvPrinter.printRecord("Name", "Title", "Department", "Salary");
            csvPrinter.printRecord("John Doe", "Software Engineer", "Engineering", "75000");
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertTrue(new File("employee_data2.csv").exists());
    }
}
