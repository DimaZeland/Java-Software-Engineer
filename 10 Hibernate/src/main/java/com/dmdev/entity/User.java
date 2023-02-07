package com.dmdev.entity;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
// Runtime аннотации, которые позволяют брать актуальные значения во время выполнения программы
@Data // equals, hashCode, getters & setters methods
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "username")
@ToString(exclude = "company") // исключить вывод поля company из вывода метода toString()
@Builder // для красового создания и инициализации сущностей
@Entity // указанный POJO class - сущность Hibernate
@Table(name = "users", schema ="public") // по умолчанию Hibernate берет название полей/класса в качестве названия таблицы/колонок [ (SQL не чувствителен к регистру))
@TypeDef(name = "dmdev", typeClass = JsonBinaryType.class) // Zпсевдоним для пользовательского типа
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @AttributeOverride(name = "birthDate", column = @Column(name = "birth_date"))
    private PersonalInfo personalInfo;

    @Column(unique = true) // уникальная колонка
    private String username;

    @Type(type = "dmdev") // указать новый тип и зарегистрировать его в Hibernate, type - полный путь к классу
    private String info;

    @Enumerated(EnumType.STRING) // убрать использование ordinal() как цифровой идентификатор типа Enum (по порядку при инициализации) и задать текстовый формат полем name (имя ENUM, указанное при инициализации)
    private Role role;
// fetch = FetchType.LAZY - ленивое инициализя подобъектов (по умолчанию для коллекций), FetchType.EAGER(жадня иницализация подобъектов)
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.ALL}) // optional = false - NOT NULL constraint, обязаны устанавливать это поле в нашу сущность
    @JoinColumn(name = "company_id") // company_id
    private Company company;
}



