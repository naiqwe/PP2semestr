package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Group {

    @XmlElementRef
    List<Student> students;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Group{");
        sb.append("students=").append(students);
        sb.append('}');
        return sb.toString();
    }
}