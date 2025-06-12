package u5w2l4test.epicode.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AutoreDto {
    @NotEmpty(message = "il nome dell'autore non può essere nullo o vuoto")
    private String nome;
    @NotEmpty(message = "il cognome dell'autore non può essere nullo o vuoto")
    private String cognome;
    @Email(message = "l'email deve avere un formato valido")
    private String email;
    @NotNull(message = "la data di nascita non può essere nulla")
    private LocalDate dataDiNascita;
}
