package service.roomService;

import model.Course.Course;
import model.Room.Room;
import service.IGenericService;

import java.util.List;

public interface IRoomService extends IGenericService<Room> {
    boolean existedRoomByName(String roomName);
    void showAvailableRoom();
    void showAvailableRoomByNumberSeat(int numberSeat);
    int getNumberRoom();

}
