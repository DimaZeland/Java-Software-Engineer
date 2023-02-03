package com.dmdev.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
// Runtime аннотации, которые позволяют брать актуальные значения во время выполнения программы
@Data // equals, hashCode, getters & setters methods
@NoArgsConstructor
@AllArgsConstructor
@Builder // для красового создания и инициализации сущностей
@Entity // указанный POJO class - сущность Hibernate
@Table(name = "users", schema ="public") // по умолчанию Hibernate берет название полей/класса в качестве названия таблицы/колонок [ (SQL не чувствителен к регистру))
public class User {

    @Id // каждая сущность в Hibernate должна иметь первычный ключ, который должен реализовать интерфейс Serializable, username - первычный ключ
    private String username;
    private String firstname;
    private String lastname;
    @Column(name = "birth_date") // привязать поле к столбцу birth_date таблицы
    private LocalDate birthDate;
    private Integer age;
    @Enumerated(EnumType.STRING) // убрать использование ordinal() как цифровой идентификатор типа Enum (по порядку при инициализации) и задать текстовый формат полем name (имя ENUM, указанное при инициализации)
    private Role role;
}