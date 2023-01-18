package com.example.todo.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
@Setter @Getter @ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(of="todoId")
@Builder

@Table(name = "tbl_todo")
public class TodoEntity {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid",strategy = "build")
    private String todoId;

    @Column(nullable = false, length=30)
    private String title;
    private boolean done;
    @CreationTimestamp
    private LocalDateTime createDate;

}
