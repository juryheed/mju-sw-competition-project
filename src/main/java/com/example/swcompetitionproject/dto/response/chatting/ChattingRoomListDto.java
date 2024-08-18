package com.example.swcompetitionproject.dto.response.chatting;

import com.example.swcompetitionproject.entity.ChattingRoom;
import lombok.Builder;
import lombok.Getter;

import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Getter
@Builder
public class ChattingRoomListDto {
    private UUID id;
    private String title;
    private int memberCount;
    private String createdAt;

    public static ChattingRoomListDto from(ChattingRoom room) {
        return ChattingRoomListDto.builder()
                .id(room.getId())
                .title(room.getTitle())
                .memberCount(room.getMemberCount())
                .createdAt(room.getCreatedAt().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")))
                .build();
    }
}
