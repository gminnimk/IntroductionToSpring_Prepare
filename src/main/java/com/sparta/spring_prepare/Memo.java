package com.sparta.spring_prepare;


// Lombok 라이브러리를 임포트합니다.
import lombok.*;


// // Lombok 애노테이션을 사용하여 자동으로 Setter와 Getter 메서드를 생성합니다.
@Setter
@Getter

// 모든 필드를 인자로 받는 생성자를 자동으로 생성합니다.
//@AllArgsConstructor

// 기본 생성자를 자동으로 생성합니다.
//@NoArgsConstructor

//  // @NonNull 또는 final 필드를 인자로 받는 생성자를 자동으로 생성합니다.
@RequiredArgsConstructor
public class Memo {
    private final String username; // username 필드는 반드시 초기값이 설정되어야 하며, 수정할 수 없습니다.
    private String contents; // contents 필드는 수정 가능합니다.
}

