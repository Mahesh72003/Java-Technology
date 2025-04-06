package com.xworkz.tilesystem;

import com.xworkz.tilesystem.tiles.Tile;
import com.xworkz.tilesystem.model.TileInfo;

public class TilesRunner {
    public static void main(String[] args) {
        TileInfo[] tileInfos = new TileInfo[5];

        TileInfo tile1 = new TileInfo();
        tile1.setTileId(1);
        tile1.setBrand("Kajaria");
        tile1.setColor("Beige");
        tile1.setMaterial("Ceramic");
        tile1.setPrice(50.75);   
        tile1.setSize("12x12");
        tile1.setType("Floor Tile");
        tileInfos[0] = tile1;

        TileInfo tile2 = new TileInfo();
        tile2.setTileId(2);
        tile2.setBrand("Somany");
        tile2.setColor("White");
        tile2.setMaterial("Vitrified");
        tile2.setPrice(120.30);   
        tile2.setSize("24x24");
        tile2.setType("Wall Tile");
        tileInfos[1] = tile2;

        TileInfo tile3 = new TileInfo();
        tile3.setTileId(3);
        tile3.setBrand("Marbonite");
        tile3.setColor("Black");
        tile3.setMaterial("Porcelain");
        tile3.setPrice(75.50);   
        tile3.setSize("18x18");
        tile3.setType("Floor Tile");
        tileInfos[2] = tile3;

        TileInfo tile4 = new TileInfo();
        tile4.setTileId(4);
        tile4.setBrand("Nitco");
        tile4.setColor("Grey");
        tile4.setMaterial("Ceramic");
        tile4.setPrice(85.99);   
        tile4.setSize("12x12");
        tile4.setType("Wall Tile");
        tileInfos[3] = tile4;

        TileInfo tile5 = new TileInfo();
        tile5.setTileId(5);
        tile5.setBrand("H&R Johnson");
        tile5.setColor("Blue");
        tile5.setMaterial("Vitrified");
        tile5.setPrice(98.00);   
        tile5.setSize("24x24");
        tile5.setType("Floor Tile");
        tileInfos[4] = tile5;

        Tile tile = new Tile();
        tile.tileInfos = tileInfos;
        tile.displayTileInfo();
    }
}
