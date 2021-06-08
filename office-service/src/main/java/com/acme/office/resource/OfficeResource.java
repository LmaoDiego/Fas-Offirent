package com.acme.office.resource;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OfficeResource {

    private Long id;
    private String address;
    private Long floor;
    private Long capacity;
    private boolean allowResource;
    private float score;
    private String description;
    private float price;
    private boolean status;
    private String comment;

}
