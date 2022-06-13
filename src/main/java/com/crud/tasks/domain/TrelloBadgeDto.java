package com.crud.tasks.domain;

import lombok.Data;

import java.util.List;

@Data
public class TrelloBadgeDto {
    private int votes;
    private List<TrelloAttachmentsByTypeDto> attachmentsByTypeList;
}
