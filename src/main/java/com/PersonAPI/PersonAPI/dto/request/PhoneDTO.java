package com.PersonAPI.PersonAPI.dto.request;

import com.PersonAPI.PersonAPI.enums.PhoneType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

//A ideia das classes do DTO é basicamente criar um nivel antes de
//enviar o modelo para o banco, fazendo verificações em tempo de execução
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {

    private Long id;
    @Enumerated(EnumType.STRING)
    private PhoneType type;
    @NotEmpty
    @Size(min=13,max=14)
    private String number;
}
