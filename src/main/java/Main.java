import service.Service;
import model.Group;
import model.Student;
import model.Subject;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.Scanner;

public class Main {

    //first_lab/src/main/resources/input_doc.xml
    //first_lab/src/main/resources/output_doc.xml
    //D:\EDU\3kurs\lab1XMLGradle\src\main\resources\student.xml
    //D:\EDU\3kurs\lab1XMLGradle\src\main\resources\student_output.xml
    public static void main(String[] args) throws JAXBException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Set the input file location: ");
        File inputDoc = new File(scanner.nextLine());

        System.out.print("Set the output file location: ");
        File outputDoc = new File(scanner.nextLine());

        JAXBContext context = JAXBContext.newInstance(Group.class, Student.class, Subject.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Marshaller marshaller = context.createMarshaller();


        Group group = (Group) unmarshaller.unmarshal(inputDoc);
        Service.fixAverageMarkForGroup(group);

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(group, outputDoc);
    }


}