package com.app.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="customer")
public class Customer implements Serializable {

    @Id
    @GeneratedValue
    private Long Id;

    @Column(name= "customer_id")
    private Long customerId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate infoAsOfDate;

    private String customerName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate customerStartDate;

    private BigDecimal customerIncome;

    @Enumerated(EnumType.STRING)
    private CustomerType customerType;

    @Enumerated(EnumType.STRING)
    private CustomerRiskClass customerRiskClass;

    @Enumerated(EnumType.STRING)
    private CustomerBusinessType customerBusinessType;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "note_id")
    private Note noteId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate noteDate;












    public LocalDate getNoteDate() {
        return noteDate;
    }

    public void setNoteDate(LocalDate noteDate) {
        this.noteDate = noteDate;
    }

    public Note getNoteId() {
        return noteId;
    }

    public void setNoteId(Note noteId) {
        this.noteId = noteId;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public LocalDate getInfoAsOfDate() {
        return infoAsOfDate;
    }

    public void setInfoAsOfDate(LocalDate infoAsOfDate) {
        this.infoAsOfDate = infoAsOfDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getCustomerStartDate() {
        return customerStartDate;
    }

    public void setCustomerStartDate(LocalDate customerStartDate) {
        this.customerStartDate = customerStartDate;
    }

    public BigDecimal getCustomerIncome() {
        return customerIncome;
    }

    public void setCustomerIncome(BigDecimal customerIncome) {
        this.customerIncome = customerIncome;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public CustomerRiskClass getCustomerRiskClass() {
        return customerRiskClass;
    }

    public void setCustomerRiskClass(CustomerRiskClass customerRiskClass) {
        this.customerRiskClass = customerRiskClass;
    }

    public CustomerBusinessType getCustomerBusinessType() {
        return customerBusinessType;
    }

    public void setCustomerBusinessType(CustomerBusinessType customerBusinessType) {
        this.customerBusinessType = customerBusinessType;
    }

}