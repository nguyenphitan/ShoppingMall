package com.nguyenphitan.glossary;
import java.util.Date;

/**
 * Persistent Object interface
 */
public interface PersistentObject {

    /** getCreatedAt */
    Date getCreatedAt();

    /** getUpdatedAt */
    Date getUpdatedAt();

    /** setCreatedAt */
    void setCreatedAt(Date insertDatetime);

    /** setUpdatedAt */
    void setUpdatedAt(Date updateDatetime);
}

