package com.sparta.nbcspringmemo.entity;

import com.sparta.nbcspringmemo.dto.MemoRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Memo {
    private Long id; //PK
    private String username; //작성자
    private String contents; //메모 내용

    public Memo(MemoRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
    }
}
