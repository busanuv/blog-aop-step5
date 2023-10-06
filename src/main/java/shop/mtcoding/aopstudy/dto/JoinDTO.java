package shop.mtcoding.aopstudy.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class JoinDTO {
    @NotNull
    private String username;
    @NotEmpty
    private String password;
    @NotEmpty
    @Size(min = 4, max = 10)
    private String email;
}
