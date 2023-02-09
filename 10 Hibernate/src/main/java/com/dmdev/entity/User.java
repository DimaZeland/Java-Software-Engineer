package com.dmdev.entity;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.*;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
// Runtime аннотации, которые позволяют брать актуальные значения во время выполнения программы
@Data // equals, hashCode, getters & setters methods
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "username")
@ToString(exclude = {"company", "profile", "userChats"}) // исключить вывод поля company из вывода метода toString()
@Entity // указанный POJO class - сущность Hibernate
@Table(name = "users", schema ="public") // по умолчанию Hibernate берет название полей/класса в качестве названия таблицы/колонок [ (SQL не чувствителен к регистру))
@TypeDef(name = "dmdev", typeClass = JsonBinaryType.class) // псевдоним для пользовательского типа
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User implements Comparable<User>, BaseEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //  сентетический идетификатор, который генерируется БД
    private Long id;

    @AttributeOverride(name = "birthDate", column = @Column(name = "birth_date"))
    private PersonalInfo personalInfo;
// columnDefinition жестко задает DDL команду при автогенерации таблиц inMemory DB
    @Column(unique = true) // уникальная колонка
    private String username;

    @Type(type = "dmdev") // указать новый тип и зарегистрировать его в Hibernate, type - полный путь к классу
    private String info;

    @Enumerated(EnumType.STRING) // убрать использование ordinal() как цифровой идентификатор типа Enum (по порядку при инициализации) и задать текстовый формат полем name (имя ENUM, указанное при инициализации)
    private Role role;
// fetch = FetchType.LAZY - ленивое инициализя подобъектов (по умолчанию для коллекций), FetchType.EAGER(жадня иницализация подобъектов)
    @ManyToOne(fetch = FetchType.LAZY) // optional = false - NOT NULL constraint, обязаны устанавливать это поле в нашу сущность
    @JoinColumn(name = "company_id") // company_id
    private Company company;

    @OneToOne(
            mappedBy = "user",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private Profile profile;

//    @Builder.Default
    @OneToMany(mappedBy = "user")
    private List<UserChat> userChats = new ArrayList<>();

    @Override
    public int compareTo(User o) {
        return username.compareTo(o.username);
    }
}




