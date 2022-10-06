package Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Room room1 = new Room(1, 3, 2);
        Room room2 = new Room(2, 1, 2);
        Room room3 = new Room(1, 4, 4);

        ArrayList<Room> roomArrayList = new ArrayList<Room>();
        roomArrayList.add(room1);
        roomArrayList.add(room2);
        roomArrayList.add(room3);


        Building building1 = new Building(roomArrayList, 3, 5, false);


        System.out.println(countLampsInBuilding(building1));
    }


    static int countLampsInBuilding(Building building) {
        int numberOfLampsInBuilding = 0;

        for (Room i : building.getRooms()) {

            numberOfLampsInBuilding += i.getNumberOfLamps();
        }
        return numberOfLampsInBuilding;

    }
}












