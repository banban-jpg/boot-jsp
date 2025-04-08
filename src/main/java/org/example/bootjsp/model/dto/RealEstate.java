package org.example.bootjsp.model.dto;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Getter
@Setter
@AllArgsConstructor // 모든 필드 만드는 생성자
@NoArgsConstructor // 걍 생성자
@RequiredArgsConstructor // 꼭 있어야 하는 생성자
@Entity
public class RealEstate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private long price;

}
