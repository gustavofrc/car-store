package database.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "incrementor")
    @GenericGenerator(name ="incrementor", strategy = "increment")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Column(name = "salary")
    private double salary;

    public double getSalary() { return salary; }

    public void setSalary(double salary) { this.salary = salary; }


    @Column(name = "commission_fee")
    private double commission_fee;

    public double getCommissionFee() { return commission_fee; }

    public void setCommissionFee(double commissionFee) { this.commission_fee = commissionFee; }

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY.EAGER)
    @JoinColumn(name = "role_id")
    private Role role_id;

    public Role getRole_id() { return role_id; }

    public void setRole_id(Role role_id) { this.role_id = role_id; }


    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY.EAGER)
    @JoinColumn(name = "person_id")
    private Person person_id;

    public Person getPersonId() { return person_id; }

    public void setPersonId(Person personId) { this.person_id = personId; }
}