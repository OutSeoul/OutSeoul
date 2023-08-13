package com.howthere.app.service.admin;

import com.howthere.app.domain.AnnouncementDTO;
import com.howthere.app.entity.admin.Announcement;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.format.DateTimeFormatter;

public interface AnnouncementService {
//    조회
    public AnnouncementDTO getAnnouncementById(Long id);

//    저장, 수정
    public void save(AnnouncementDTO announcementDTO);

//    삭제
    public void remove(AnnouncementDTO announcementDTO);

//    리스트 가져오기(페이징 처리)
    public Page<AnnouncementDTO> getAnnouncementList(Pageable pageable, String keyword);

//    DTO로 변환
    default AnnouncementDTO toDTO(Announcement announcement){
        return AnnouncementDTO.builder()
                .id(announcement.getId())
                .announcementTitle(announcement.getAnnouncementTitle())
                .announcementContent(announcement.getAnnouncementContent())
                .createdDate(announcement.getCreatedDate())
                .updatedDate(announcement.getUpdatedDate())
                .build();
    }

//    Entity로 변환
    default Announcement toEntity(AnnouncementDTO announcementDTO){
        return Announcement.builder()
                .id(announcementDTO.getId())
                .announcementTitle(announcementDTO.getAnnouncementTitle())
                .announcementContent(announcementDTO.getAnnouncementContent())
                .build();
    }
}