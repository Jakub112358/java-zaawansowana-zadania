package zad4;

//Stwórz klasę enum Continent, która będzie zawierać informację o nazwie kontynentu oraz jego powierzchni (https://pl.wikipedia.org/wiki/Kontynent).
// W ramach enuma zdeklaruj wszystkie kontynenty oraz metody statyczne do:
// - zwracania największego kontynentu (skorzystaj z metody values())
// - zwracania najmniejszego kontynentu (skorzystajc z metody values())
public enum Continent {
    AFRICA(30_400_000, "Africa"),
    SOUTHAMERICA(17_800_000, "South America"),
    NORTHAMERICA(24_200_000, "North America"),
    ANTARCTICA(13_200_000, "Antarctica"),
    AUSTRALIA(7_700_000, "Australia"),
    EUROPE(10_200_000, "Europe"),
    ASIA(44_600_000, "Asia");

    public final int area;
    public final String name;

    Continent(int area, String name) {
        this.area = area;
        this.name = name;
    }

    public static Continent getBiggestContinent() {
        Continent biggestContinent = values()[0];
        for (Continent value : values()) {
            if (value.area > biggestContinent.area) {
                biggestContinent = value;
            }
        }
        return biggestContinent;
    }

    public static Continent getSmallestContinent() {
        Continent smallestContinent = values()[0];
        for (Continent value : values()) {
            if (value.area < smallestContinent.area) {
                smallestContinent = value;
            }
        }
        return smallestContinent;
    }

}
