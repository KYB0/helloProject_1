package com.exam.examproject.service;

import com.exam.examproject.repository.memberRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Transactional
@Service
@RequiredArgsConstructor
public class memberService {
    private final memberRepository memberRep;
}
