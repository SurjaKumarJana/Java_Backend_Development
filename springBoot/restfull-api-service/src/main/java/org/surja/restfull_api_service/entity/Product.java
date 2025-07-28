package org.surja.restfull_api_service.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

/*
Lombok is a Java library used to reduce boilerplate code in Java classes.
It works through annotations and integrates well with IDEs like IntelliJ IDEA and Eclipse.

Common Lombok annotations:
- @Getter / @Setter     : Auto-generates getter and setter methods.
- @ToString             : Creates a toString() method.
- @EqualsAndHashCode    : Generates equals() and hashCode() methods.
- @NoArgsConstructor    : Generates a no-argument constructor.
- @AllArgsConstructor   : Generates a constructor with all fields.

- @RequiredArgsConstructor : Generates constructor for final fields.
Generates a constructor for:
   a) All final fields.
   b) All fields annotated with @NonNull.

- @Data                 : Shortcut for @Getter, @Setter, @ToString, @EqualsAndHashCode, @RequiredArgsConstructor.
- @Builder              : Implements the builder pattern.

Lombok requires plugin support in IDE:
- In IntelliJ IDEA: Install 'Lombok' plugin and enable annotation processing.
- In Eclipse: Install Lombok JAR and configure it with Eclipse.

Advantage:
- Helps keep code clean and concise.
- Saves time by auto-generating repetitive code.
*/

// this is a lombok annotation .
// main feature reduce boilerplate code
@Data
public class Product {
    private int id;
    private String name;
    private double cost;

}
