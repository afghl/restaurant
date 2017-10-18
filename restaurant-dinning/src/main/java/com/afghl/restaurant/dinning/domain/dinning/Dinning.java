package com.afghl.restaurant.dinning.domain.dinning;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "dinning")
public class Dinning {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "table_id", nullable = false)
    private long tableId;

    @Column(name = "status", nullable = false)
    private int status;

    @Column(name = "started_at")
    private LocalDateTime startedAt;

    @Column(name = "ended_at")
    private LocalDateTime endedAt;

    @Column(name = "created_at", insertable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", insertable = false, updatable = false)
    private LocalDateTime updatedAt;

}
