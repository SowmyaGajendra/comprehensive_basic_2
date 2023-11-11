package Problem1;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadAndWriteData1 {
    public static void main(String[] args) {
        List<Student> studentList = readDataFromExcel("Student_data.xlsx");

        if (studentList != null) {
            System.out.println("Reading Data from Excel and Storing it in Collection:");
            for (Student student : studentList) {
                System.out.println(student);
            }

            writeDataToExcel("OutPut_data.xlsx", studentList);
            System.out.println("Data has been written to output_data.xlsx");
        } else {
            System.out.println("Error reading data from Excel.");
        }
    }

    public static List<Student> readDataFromExcel(String excelFileName) {
        List<Student> studentList = new ArrayList<>();

        try (FileInputStream fileInputStream = new FileInputStream("./src/test/resources/Student_data.xlsx");
             Workbook workbook = new XSSFWorkbook(fileInputStream)) {

            Sheet sheet = workbook.getSheetAt(0);

            Iterator<Row> iterator = sheet.iterator();

            // Skip the header row
            if (iterator.hasNext()) {
                iterator.next();
            }

            while (iterator.hasNext()) {
                Row row = iterator.next();

                String name = row.getCell(0).getStringCellValue();
                String course = row.getCell(1).getStringCellValue();
                String fee = row.getCell(2).getStringCellValue();

                studentList.add(new Student(name, course, fee));
            }

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return studentList;
    }

    public static void writeDataToExcel(String excelFileName, List<Student> studentList) {
        try (Workbook workbook = new XSSFWorkbook();
             FileOutputStream fileOutputStream = new FileOutputStream("./src/test/resources/OutPut_data.xlsx")) {

            Sheet sheet = workbook.createSheet("StudentData");

            // Create the header row
            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Name");
            headerRow.createCell(1).setCellValue("Courses");
            headerRow.createCell(2).setCellValue("Fee");

            int rowNum = 1;
            for (Student student : studentList) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(student.getName());
                row.createCell(1).setCellValue(student.getCourses());
                row.createCell(2).setCellValue(student.getFee());
            }

            workbook.write(fileOutputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Student {
    private String name;
    private String courses;
    private String fee;

    public Student(String name, String courses, String fee) {
        this.name = name;
        this.courses = courses;
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public String getCourses() {
        return courses;
    }

    public String getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Courses: " + courses + ", Fee: " + fee;
    }
    
    
}

