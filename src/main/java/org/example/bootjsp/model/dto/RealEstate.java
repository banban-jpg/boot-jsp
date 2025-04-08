package org.example.bootjsp.model.dto;

import jakarta.persistence.*;
import lombok.*;

// Lombok
@Getter
@Setter
@NoArgsConstructor // 그냥 생성자
// 아니 그럼 그냥 @Data 쓰면 안되요? -> (ㅂ팀장님한테 불려간다니까...)
// 알았어요 그냥 JPA 안쓰고 MyBatis 쓰고 Record 쓰겠읍니다 ㅠㅠ
// JPA
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
    // JPQL은 생략하겠다... (AI의 도움을 받아보세요...)
}
