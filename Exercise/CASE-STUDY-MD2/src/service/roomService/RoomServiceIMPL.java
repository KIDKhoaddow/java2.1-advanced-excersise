package service.roomService;

import model.Room.Room;
import model.User.Student;

import java.util.List;

public class RoomServiceIMPL implements IRoomService {
    public static  String PATH_ROOM;
    public static List<Room> roomList;


    @Override
    public List<Room> findAll() {
        return roomList;
    }

    @Override
    public Room findById(int id) {
        for (Room element:roomList) {
            if(element.getRoomID()==id){
                return element;
            }
        }

        return null;
    }
    public Room findByName(String roomName){
        for (Room element:roomList) {
            if(element.getRoomName().equals(roomName)){
                return  element;
            }
        }
        return null;
    }

    @Override
    public void save(Room room) {
        roomList.add(room);
    }

    @Override
    public void deleteById(int id) {
        System.out.println(roomList.remove(roomList.indexOf(findById(id))));
    }

    @Override
    public void editById(int id) {

    }

    @Override
    public int getNumberRoom() {
        return roomList.size();
    }

    @Override
    public void dispById(int id) {
        System.out.println(findById(id));
    }

    @Override
    public void dispAll() {
        for (Room element:roomList) {
            System.out.println(element);
        }
    }

    @Override
    public boolean existedRoomByName(String roomName) {
        for (Room element:roomList) {
            if(element.getRoomName().equals(roomName)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void showAvailableRoom() {
        for (Room element:roomList) {
            if(element.getRoomStatus()){
                System.out.println(element);
            }
        }
    }

    @Override
    public void showAvailableRoomByNumberSeat(int numberSeat) {
        for(Room element:roomList){
            if(element.getNumberOfSeat()==numberSeat){
                System.out.println(element);
            }
        }
    }
}
