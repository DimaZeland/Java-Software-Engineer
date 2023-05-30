package com.spring.bets.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class Bet
{
    @NotEmpty(message = "The name must not be blank")
    @Size(min = 3, max = 8, message = "The name must be between 3 and 8 characters long")
    private String carName;
    @Min(value = 1, message = "The betting amount must be $1 or more")
    private Integer betAmount;
}
