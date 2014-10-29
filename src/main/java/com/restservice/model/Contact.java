package com.restservice.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Document(collection = "contacts")
@XmlRootElement
@ToString()
@EqualsAndHashCode(of = {"id", "name"})
public class Contact implements Serializable {

    @Id
    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String address;

    @Getter
    @Setter
    private String localPhone;

    @Getter
    @Setter
    private String internationalPhone;
}
