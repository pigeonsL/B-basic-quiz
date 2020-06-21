package tw.gtb.quiz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private long id;
    @NotBlank
    private String name;
    @NotBlank
    private long age;
    @NotBlank
    private String avatar;
    private String description;
}