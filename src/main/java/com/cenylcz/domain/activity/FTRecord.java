package com.cenylcz.domain.activity;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ft_record", schema = "activity")
public class FTRecord extends Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ft_record_key", unique = true, nullable = false)
    private Integer ftRecordKey;

    @CsvBindByName(column = "symbol")
    @Column(name = "symbol", unique = false, nullable = false)
    private String symbol;

    @CsvBindByName(column = "quantity")
    @Column(name = "quantity", unique = false, nullable = false)
    private Double quantity;

    @CsvBindByName(column = "price")
    @Column(name = "price", unique = false, nullable = false)
    private Double price;

    @CsvBindByName(column = "action")
    @Column(name = "action", unique = false, nullable = true)
    private String action;

    @CsvBindByName(column = "description")
    @Column(name = "description", unique = false, nullable = true)
    private String description;

    @CsvDate(value = "yyyy-MM-dd")
    @CsvBindByName(column = "tradeDate")
    @Column(name = "trade_date", unique = false, nullable = false)
    private LocalDate tradeDate;

    @CsvDate(value = "yyyy-MM-dd")
    @CsvBindByName(column = "settledDate")
    @Column(name = "settled_date", unique = false, nullable = false)
    private LocalDate settledDate;

    @CsvBindByName(column = "interest")
    @Column(name = "interest", unique = false, nullable = true)
    private Double interest;

    @CsvBindByName(column = "amount")
    @Column(name = "amount", unique = false, nullable = false)
    private Double amount;

    @CsvBindByName(column = "commission")
    @Column(name = "commission", unique = false, nullable = true)
    private Double commission;

    @CsvBindByName(column = "fee")
    @Column(name = "fee", unique = false, nullable = true)
    private Double fee;

    @CsvBindByName(column = "cusip")
    @Column(name = "cusip", unique = false, nullable = true)
    private String cusip;

    @CsvBindByName(column = "recordType")
    @Column(name = "record_type", unique = false, nullable = true)
    private String recordType;

    public FTRecord() {
    }

    public FTRecord(Integer ftRecordKey, String symbol, Double quantity, Double price, String action, String description, LocalDate tradeDate, LocalDate settledDate, Double interest, Double amount, Double commission, Double fee, String cusip, String recordType) {
        this.ftRecordKey = ftRecordKey;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
        this.action = action;
        this.description = description;
        this.tradeDate = tradeDate;
        this.settledDate = settledDate;
        this.interest = interest;
        this.amount = amount;
        this.commission = commission;
        this.fee = fee;
        this.cusip = cusip;
        this.recordType = recordType;
    }

    public Integer getFtRecordKey() {
        return ftRecordKey;
    }

    public void setFtRecordKey(Integer ftRecordKey) {
        this.ftRecordKey = ftRecordKey;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(LocalDate tradeDate) {
        this.tradeDate = tradeDate;
    }

    public LocalDate getSettledDate() {
        return settledDate;
    }

    public void setSettledDate(LocalDate settledDate) {
        this.settledDate = settledDate;
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public String getCusip() {
        return cusip;
    }

    public void setCusip(String cusip) {
        this.cusip = cusip;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    @Override
    public String toString() {
        return "FTRecord{" +
                "ftRecordKey=" + ftRecordKey +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", action='" + action + '\'' +
                ", description='" + description + '\'' +
                ", tradeDate=" + tradeDate +
                ", settledDate=" + settledDate +
                ", interest=" + interest +
                ", amount=" + amount +
                ", commission=" + commission +
                ", fee=" + fee +
                ", cusip='" + cusip + '\'' +
                ", recordType='" + recordType + '\'' +
                '}';
    }
}
