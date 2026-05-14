package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class SecurityCategory {

    @Id
    @GeneratedValue()
    private long categoryId;

    @Column(nullable = false)
    private String categoryName;

    protected SecurityCategory() {

    }

    public SecurityCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
