package MapGenerator;

public class CityMap extends Map {

    public CityMap(int width, int height) {
        super(width, height);
    }

    @Override
    Tile createTile() {
        int rand = random.nextInt(3);
        switch (rand) {
            case 0: return new RoadTile();
            case 1: return new ForestTile();
            case 2: return new BuildingTile();
            default: return new RoadTile();
        }
    }
}