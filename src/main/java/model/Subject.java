package model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Subject {

    @XmlAttribute(name = "title")
    private String title;

    @XmlAttribute(name = "mark")
    private int mark;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Subject{");
        sb.append("title='").append(title).append('\'');
        sb.append(", mark=").append(mark);
        sb.append('}');
        return sb.toString();
    }
}