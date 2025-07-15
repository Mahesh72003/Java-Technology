package com.xwork.chess.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ChessPieceDto implements Comparable<ChessPieceDto> {
    private String name;
    private String position;
    private String move;
    private boolean isOneStep;
    private String color;

    @Override
    public int compareTo(ChessPieceDto o) {
        return this.getPosition().compareTo(o.getPosition());
    }
}
