package com.howthere.app.repository.admin;

import com.howthere.app.domain.QuestionDTO;
import com.howthere.app.domain.QuestionDetailDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface QuestionQueryDSL {
    public Page<QuestionDTO> findMyQuestions(Long memberId, String searchText, Pageable pageable);
    public QuestionDetailDTO findQnAById(Long id);
}