package arraylist;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CountryDto {
    private String country;
    private long population;
    private String primeMinister;
}
