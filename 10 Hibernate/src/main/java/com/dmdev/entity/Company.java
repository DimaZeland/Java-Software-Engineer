package com.dmdev.entity;

import lombok.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.SortNatural;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "name")
@ToString(exclude = "users")
@Builder
@Entity
//@BatchSize(size = 3) // для маппинга @ManyToOne аннотацию @BatchSize используют над сущностью
@Audited
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Companies")
public class Company implements BaseEntity<Integer> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // синтетически генерируемый ключ
    private Integer id;

    @Column(nullable = false, unique = true)
    private String name;

    @Builder.Default//    @JoinColumn(name = "company_id")
    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
// one Company object to many objects fields, orphanRemoval -> удаление данных изсущности влечет удаление данных из БД
    @MapKey(name = "username") // ключем в map users будет поле username объекта User
    @SortNatural
    // отсортирует как TreeSet внутреннюю коллекцию Hibernate, класс сортируемых элементов должен реализовать интерфейс Comparable
    @NotAudited
    private Map<String, User> users = new TreeMap<>();

    @Builder.Default
    @ElementCollection // добавить елемент из другого класса, который не является сущонстью
    @CollectionTable(name = "company_locale", joinColumns = @JoinColumn(name = "company_id"))
    // подключится к таблице company_locale
//    @AttributeOverride(name = "lang", column = @Column(name = "language"))
//    private List<LocaleInfo> locales = new ArrayList<>();
    @MapKeyColumn(name = "lang")
    @Column(name = "description") // внести в лист locales только значения из поля description таблицы company_locale
    @NotAudited
    private Map<String, String> locales = new HashMap<>();

    public void addUser(User user) {
        users.put(user.getUsername(), user);
        user.setCompany(this);
    }
}