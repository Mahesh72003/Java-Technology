package com.xwork.chess;

import com.xwork.chess.dto.ChessPieceDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChessPieceRunner {
    public static void main(String[] args) {
        List<ChessPieceDto> pieces = new ArrayList<>();

        pieces.add(new ChessPieceDto("King", "E1", "any direction", true, "White"));
        pieces.add(new ChessPieceDto("Queen", "D1", "any direction", false, "White"));
        pieces.add(new ChessPieceDto("Rook", "A1", "straight", false, "Black"));
        pieces.add(new ChessPieceDto("Bishop", "C1", "diagonal", false, "White"));
        pieces.add(new ChessPieceDto("Knight", "B1", "L-shape", false, "Black"));
        pieces.add(new ChessPieceDto("Pawn", "A2", "one step forward", true, "White"));
        pieces.add(new ChessPieceDto("Pawn", "B2", "one step forward", true, "Black"));
        pieces.add(new ChessPieceDto("Pawn", "C2", "one step forward", true, "White"));
        pieces.add(new ChessPieceDto("Rook", "H8", "straight", false, "White"));
        pieces.add(new ChessPieceDto("Bishop", "F8", "diagonal", false, "Black"));
        pieces.add(new ChessPieceDto("Knight", "G1", "L-shape", false, "White"));
        pieces.add(new ChessPieceDto("Knight", "G8", "L-shape", false, "Black"));
        pieces.add(new ChessPieceDto("Queen", "D8", "any direction", false, "Black"));
        pieces.add(new ChessPieceDto("Rook", "H1", "straight", false, "Black"));
        pieces.add(new ChessPieceDto("Pawn", "D2", "one step forward", true, "Black"));
        pieces.add(new ChessPieceDto("Pawn", "E7", "one step forward", true, "Black"));

        System.out.println("Before Sorting:");
        for (ChessPieceDto piece : pieces) {
            System.out.println(piece);
        }

        Collections.sort(pieces);

        System.out.println("\nAfter Sorting:");
        for (ChessPieceDto piece : pieces) {
            System.out.println(piece);
        }
    }
}
