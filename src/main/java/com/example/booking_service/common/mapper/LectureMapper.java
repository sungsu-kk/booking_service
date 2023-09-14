package com.example.booking_service.common.mapper;

import com.example.booking_service.adapter.in.web.lecture.LectureRequest;
import com.example.booking_service.adapter.out.persistence.lecture.LectureEntity;
import com.example.booking_service.domain.Lecture;
import org.springframework.stereotype.Component;

@Component
public class LectureMapper {

    public Lecture of (LectureEntity entity){
        return Lecture.builder()
                .id(entity.getId())
                .speaker(entity.getSpeaker())
                .place(entity.getPlace())
                .contents(entity.getContents())
                .startDateTime(entity.getStartDateTime())
                .capacity(entity.getCapacity())
                .build();
    }

    public LectureEntity of(Lecture lecture){
        return LectureEntity.builder()
                .id(lecture.getId())
                .speaker(lecture.getSpeaker())
                .place(lecture.getPlace())
                .contents(lecture.getContents())
                .startDateTime(lecture.getStartDateTime())
                .capacity(lecture.getCapacity())
                .build();
    }

    public Lecture of(LectureRequest.RegisterLectureCommand command){
        return Lecture.builder()
                .speaker(command.getSpeaker())
                .place(command.getPlace())
                .contents(command.getContents())
                .startDateTime(command.getStartDateTime())
                .capacity(command.getCapacity())
                .build();
    }

}