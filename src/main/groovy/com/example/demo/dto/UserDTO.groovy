package com.example.demo.dto

import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

class UserDTO {

    @NotNull
    @NotEmpty
    @NotBlank
    String userName

    String age

    String address
}
