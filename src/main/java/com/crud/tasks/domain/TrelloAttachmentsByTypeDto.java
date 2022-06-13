package com.crud.tasks.domain;

import lombok.Data;

import java.util.List;

@Data
public class TrelloAttachmentsByTypeDto {
    private List<TrelloTrelloDto> trelloList;
}
