package model.Room;

<<<<<<< HEAD
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
=======
import model.Class.EnglishClass;
import model.Class.Shift;
import service.Room.RoomServiceIMPL;
import service.user.UserServiceIMPL;

public class Room {
    private int id;
    private String roomId;
    private String roomName;
    private int roomNumberSeat;
    private RoomStatus roomStatus;
    private EnglishClass firstShiftClass;
    private EnglishClass secondShiftClass;


    public Room() {
    }

    public Room(String roomName, int roomNumberSeat) {
        try {
            id = Integer.parseInt(RoomServiceIMPL.roomList.get(UserServiceIMPL.studentList.size() - 1).getRoomId().substring(3));
        } catch (Exception e) {
            id = 0;
        }
        this.roomId = "ROOM" + id;
        this.roomName = roomName;
        this.roomNumberSeat = roomNumberSeat;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        try{
            return roomName;
        }catch (Exception e){
            return "";
        }
>>>>>>> 6ba14ee (Exercise)
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

<<<<<<< HEAD
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
=======
    public int getRoomNumberSeat() {
        return roomNumberSeat;
    }

    public void setRoomNumberSeat(int roomNumberSeat) {
        this.roomNumberSeat = roomNumberSeat;
    }

    public RoomStatus getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(RoomStatus roomStatus) {
        this.roomStatus = roomStatus;
    }

    public EnglishClass getFirstShiftClass() {
        return firstShiftClass;
    }

    public boolean setFirstShiftClass(EnglishClass firstShiftClass) {
        EnglishClass temp=this.firstShiftClass;
        this.firstShiftClass = firstShiftClass;
        if (checkSeat(firstShiftClass.getNumberStudent())&&checkShift()) {
            temp=null;
            return true;
        }else {
            this.firstShiftClass=temp;
            temp=null;
            return false;
        }
    }

    public EnglishClass getSecondShiftClass() {
        return secondShiftClass;
    }

    public boolean setSecondShiftClass(EnglishClass secondShiftClass) {
        EnglishClass temp=this.secondShiftClass;
        this.secondShiftClass = secondShiftClass;
        if (checkSeat(secondShiftClass.getNumberStudent())&&checkShift()) {
            temp=null;
            return true;
        }else {
            this.secondShiftClass=temp;
            temp=null;
            return false;
        }
    }

    private boolean checkSeat(int numberStudent) {
        return numberStudent <= roomNumberSeat;
    }

    private boolean checkShift() {
        return firstShiftClass.getShift() != secondShiftClass.getShift();
    }
    public  String getFirstShiftClassName(){
        return firstShiftClass.getClassName();
    }
    public  String getSecondShiftClassName(){
        return secondShiftClass.getClassName();
    }


>>>>>>> 6ba14ee (Exercise)
}
