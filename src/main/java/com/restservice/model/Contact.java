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
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"id", "name"})
public class Contact implements Serializable {

    @Id
    private String id;
    private String name;
    private String address;
    private String localPhone;
    private String internationalPhone;
}
