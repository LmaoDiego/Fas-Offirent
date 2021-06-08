package com.acme.geographic.resource;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
public class SaveDistrictResource {
    @NotNull
    @Size(max = 100)
    private String name;
}
