package com.jojoldu.webservice;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jojoldu.webservice.domain.PostsRepository;
import com.jojoldu.webservice.dto.PostsSaveRequestDto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class PostsService {
    private PostsRepository postsRepository;
    
    @Transactional
    public Long save(PostsSaveRequestDto dto) {
        return postsRepository.save(dto.toEntity()).getId();
    }

}
