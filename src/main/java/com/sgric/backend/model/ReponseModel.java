package com.sgric.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReponseModel {

    private boolean success;
    private Object data;
    private String info;
}
