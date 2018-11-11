package com.soft.task3.country;

public enum Continent {
    AFRICA,
    ASIA,
    EUROPE,
    NORTH_AMERICA,
    AUSTRALIA_AND_OCEANIA,
    SOUTH_AMERICA,
    IN_THE_MIDDLE_OF_NOWHERE;

    public static Continent getContinent(String country) {
        switch (country) {
        case "ALGERIA": case "EGYPT": case "ETHIOPIA": case "TUNISIA":
            return Continent.AFRICA;
        case "JAPAN": case "RUSSIA": case "TAIWAN": case "VIETNAM":
            return Continent.ASIA;
        case "AUSTRIA": case "FRANCE": case "ITALY": case "UKRAINE":
            return Continent.EUROPE;
        case "CANADA": case "HONDURAS": case "MEXICO": case "USA":
            return Continent.NORTH_AMERICA;
        case "ARGENTINA": case "BRAZIL": case "PERU": case "URUGUAY":
            return Continent.SOUTH_AMERICA;
        case "AUSTRALIA": case "FIJI": case "MICRONESIA": case "VANUATU":
            return Continent.AUSTRALIA_AND_OCEANIA;
        default:
            return Continent.IN_THE_MIDDLE_OF_NOWHERE;
        }
    }
}
