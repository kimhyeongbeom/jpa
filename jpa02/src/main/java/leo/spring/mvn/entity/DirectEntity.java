package leo.spring.mvn.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "direct")
public class DirectEntity {

    @Id
    private Long number;

    private String name;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Long getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public DirectEntity(){

    }

    public DirectEntity(Long number, String name, LocalDateTime createdAt,
                        LocalDateTime updatedAt) {
        this.number = number;
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}