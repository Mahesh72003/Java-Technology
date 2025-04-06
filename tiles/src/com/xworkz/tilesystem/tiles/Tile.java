package com.xworkz.tilesystem.tiles;

import com.xworkz.tilesystem.model.TileInfo;

public class Tile {

    public TileInfo[] tileInfos;

    public void displayTileInfo() {
        for (TileInfo tile : tileInfos) {
            System.out.println("----------------------------------------------------");
            System.out.println("The Tile ID is: " + tile.getTileId());
            System.out.println("The Tile Brand is: " + tile.getBrand());
            System.out.println("The Tile Color is: " + tile.getColor());
            System.out.println("The Tile Material is: " + tile.getMaterial());
            System.out.println("The Tile Price is: " + tile.getPrice() + " per square foot");
            System.out.println("The Tile Size is: " + tile.getSize());
            System.out.println("The Tile Type is: " + tile.getType());
            System.out.println("----------------------------------------------------");
        }
    }
}
