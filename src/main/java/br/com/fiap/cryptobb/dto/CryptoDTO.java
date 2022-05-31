package br.com.fiap.cryptobb;

import java.math.BigDecimal;

public class CryptoDTO {
    int id;
    String name;
    String acronym;
    BigDecimal usdValue;

    public CryptoDTO(int id, String name, String acronym, BigDecimal usdValue) {
        this.id = id;
        this.name = name;
        this.acronym = acronym;
        this.usdValue = usdValue;
    }

    public CryptoDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public BigDecimal getUsdValue() {
        return usdValue;
    }

    public void setUsdValue(BigDecimal usdValue) {
        this.usdValue = usdValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
