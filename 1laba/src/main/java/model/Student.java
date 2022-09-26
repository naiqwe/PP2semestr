package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {

    @XmlAttribute(name = "firstname")
    private String firstName;

    @XmlAttribute(name = "lastname")
    private String lastName;

    @XmlElementRef
    private ArrayList<Subject> subjects;

    @XmlAttribute
    private int groupNumber;

    @XmlElement
    private double average;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", subjects=").append(subjects);
        sb.append(", groupNumber=").append(groupNumber);
        sb.append(", average=").append(average);
        sb.append('}');
        return sb.toString();
    }
}