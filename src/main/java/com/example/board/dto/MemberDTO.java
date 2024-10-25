package com.example.board.dto;

import com.example.board.entity.Member;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class MemberDTO {

    @NotBlank(message = "*이름은 필수 입력 값입니다.")
    private String name;

    @NotBlank(message = "*이메일은 필수 입력 값입니다.")
    @Pattern(regexp = "^(?:\\w+\\.?)*\\w+@(?:\\w+\\.)+\\w+$", message = "*이메일 형식이 올바르지 않습니다.")
    private String email;

    @NotBlank(message = "*비밀번호는 필수 입력 값입니다.")
    @Pattern(regexp = "(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,16}", message = "*비밀번호는 8~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요.")
    private String pw;

    private LocalDateTime regDate;
    private LocalDateTime modDate;

//    // DTO를 Entity로 변환
//    public static Member toEntity(MemberDTO memberDTO) {
//        return new Member(memberDTO.getName(), memberDTO.getEmail());
//    }
//
//    // Entity를 DTO로 변환
//    public static MemberDTO fromEntity(Member member) {
//        return new MemberDTO(member.getName(), member.getEmail());
//    }
}
