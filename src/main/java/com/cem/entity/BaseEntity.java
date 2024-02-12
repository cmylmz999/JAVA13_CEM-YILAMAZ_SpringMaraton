package com.cem.entity;

import com.cem.utils.enums.EStatus;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@Builder
@AllArgsConstructor
public class BaseEntity {
    @Builder.Default
    Long createAt = System.currentTimeMillis();
    @Builder.Default
    Long updateAt = System.currentTimeMillis();
    @Builder.Default
    EStatus Status = EStatus.PENDING;


    public BaseEntity() {
        this.createAt = System.currentTimeMillis();
        this.updateAt = System.currentTimeMillis();
        this.Status = EStatus.PENDING;
    }
}
