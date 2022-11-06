package ru.boris.spring.FirstRestApp.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.context.properties.ConstructorBinding;

@Data
@AllArgsConstructor
public class PersonErrorResponse {
    private String message;
    private long timestamp;
}
