package model.Room;

import java.io.Serializable;

public class RoomStatus implements Serializable {

    public  enum Status{
        AVAILABLE,UNAVAILABLE,FIXING
    }
}
