// package am.cs322.model;

// import jakarta.persistence.*;

// import java.util.Objects;

// @Entity
// @Table(name = "\"user\"")
// public class User {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;
//     private String firstName;
//     private String lastName;

//     public User() {

//     }

//     public User(String firstName, String lastName) {
//         this.firstName = firstName;
//         this.lastName = lastName;
//     }

//     @Override
//     public boolean equals(Object o) {
//         if (this == o) return true;
//         if (o == null || getClass() != o.getClass()) return false;
//         User user = (User) o;
//         return Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName);
//     }

//     @Override
//     public int hashCode() {
//         return Objects.hash(firstName, lastName);
//     }

//     public String getFirstName() {
//         return firstName;
//     }

//     public String getLastName() {
//         return lastName;
//     }
// }


package am.cs322.model;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="users")
public class User {
    public User() {

    }
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;


    @Column(name="firstName")
    private String firstName;


    @Column(name="lastName")
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public Long getId() {
        return Id;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "EmployeeEntity [id=" + Id + ", firstName=" + firstName +
                ", lastName=" + lastName +  "]";
    }
}