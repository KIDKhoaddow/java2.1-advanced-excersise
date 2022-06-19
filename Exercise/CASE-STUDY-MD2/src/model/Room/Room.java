package model.Room;

import java.io.Serializable;

public class Room implements Serializable {
    private  int roomID;
    private  String roomName;
    private  int numberOfSeat;
    private RoomStatus.Status roomStatus;
    private  RoomShift.Shift roomShift;
    private boolean isFirstShiftEmpty=true;
    private boolean isSecondShiftEmpty=true;


    public Room() {

    }

    public Room(int roomID, int numberOfSeat,
                boolean isFirstShiftEmpty, boolean isSecondShiftEmpty) {
        this.roomID = roomID;
        this.numberOfSeat = numberOfSeat;
        this.isFirstShiftEmpty = isFirstShiftEmpty;
        this.isSecondShiftEmpty = isSecondShiftEmpty;
        this.roomStatus =changeStatusRoom();
    }

    public boolean isFirstShiftEmpty() {
        return isFirstShiftEmpty;
    }

    public boolean isSecondShiftEmpty() {
        return isSecondShiftEmpty;
    }

    public void setFirstShiftEmpty(boolean firstShiftEmpty) {
        isFirstShiftEmpty = firstShiftEmpty;
        changeStatusRoom();
    }

    public void setSecondShiftEmpty(boolean secondShiftEmpty) {
        isSecondShiftEmpty = secondShiftEmpty;
        changeStatusRoom();
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public boolean getRoomStatus(){
        if(this.roomStatus== RoomStatus.Status.AVAILABLE){
            return true;
        }
        return false;
    }

    public RoomStatus.Status changeStatusRoom(){
        if(!this.isFirstShiftEmpty&&!this.isSecondShiftEmpty){
            return RoomStatus.Status.UNAVAILABLE;
        }else {
            return RoomStatus.Status.AVAILABLE;
        }
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomID=" + roomID +
                ", numberOfSeat=" + numberOfSeat +
                ", roomStatus=" + roomStatus +
                ", isFirstShiftEmpty=" + isFirstShiftEmpty +
                ", isSecondShiftEmpty=" + isSecondShiftEmpty +
                '}';
    }
}
