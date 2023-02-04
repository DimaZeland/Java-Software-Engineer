package com.dmdev.entity;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
// Runtime аннотации, которые позволяют брать актуальные значения во время выполнения программы
@Data // equals, hashCode, getters & setters methods
@NoArgsConstructor
@AllArgsConstructor
@Builder // для красового создания и инициализации сущностей
@Entity // указанный POJO class - сущность Hibernate
@Table(name = "users", schema ="public") // по умолчанию Hibernate берет название полей/класса в качестве названия таблицы/колонок [ (SQL не чувствителен к регистру))
@TypeDef(name = "dmdev", typeClass = JsonBinaryType.class) // Zпсевдоним для пользовательского типа
public class User {

    @Id // каждая сущность в Hibernate должна иметь первычный ключ, который должен реализовать интерфейс Serializable, username - первычный ключ
    private String username;
    private String firstname;
    private String lastname;

//        @Convert(converter = BirthdayConverter.class) // приобразование типов полей таблицы в типы полей класса сущности
    @Column(name = "birth_date") // привязать поле к столбцу birth_date таблицы
    private Birthday birthDate;

    @Type(type = "dmdev") // указать новый тип и зарегистрировать его в Hibernate, type - полный путь к классу
    private String info;

    @Enumerated(EnumType.STRING) // убрать использование ordinal() как цифровой идентификатор типа Enum (по порядку при инициализации) и задать текстовый формат полем name (имя ENUM, указанное при инициализации)
    private Role role;
}