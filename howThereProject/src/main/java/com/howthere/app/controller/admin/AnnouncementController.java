package com.howthere.app.controller.admin;

import com.howthere.app.domain.AnnouncementDTO;
import com.howthere.app.service.admin.AnnouncementService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/announcement/*")
public class AnnouncementController {

    private final AnnouncementService announcementService;

    // http://localhost:10000/announcement/announcement_list
    @GetMapping("announcement_list")
    public void announcementList() {;}

    // http://localhost:10000/announcement/announcement
    @GetMapping("announcement")
    public void announcement() {;}

    // http://localhost:10000/announcement/list
    @GetMapping("list")
    @ResponseBody
    public Page<AnnouncementDTO> getList(@PageableDefault(sort = "id", direction = Sort.Direction.DESC) Pageable pageable){
        return announcementService.getAnnouncementList(pageable);
    }
}
