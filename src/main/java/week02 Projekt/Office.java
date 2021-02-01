package week02;

import java.util.ArrayList;
import java.util.List;

public class Office {
    public Object printMeetingRoomsWithName;
    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);

    }

    public List<MeetingRoom> getMeetingRooms() {
        return meetingRooms;
    }

    public void printNames() {
        for (MeetingRoom m : meetingRooms){
            System.out.println(m.getName());
        }
    }

    public void printNamesReverse() {
        for (int i=meetingRooms.size()-1;i>=0; i--) {
            System.out.println(meetingRooms.get(i));
        }
    }

    public void printEventNames() {
        System.out.println("printEventNames");
        for (MeetingRoom meetingRoom: meetingRooms) {
            System.out.println(meetingRoom.getName());

    }
            }
    }

    public void printMeetingRoomsContains() {
                System.out.println("printMeetingRoomsContains");
                for (MeetingRoom meetingRoom: meetingRooms) {
                    System.out.println(meetingRoom.getName());
            }
    }

    public void printAreasLargerThan(int area) {
        System.out.println("printAreasLargerThan");
        for (MeetingRoom meetingRoom: meetingRooms) {
            if (meetingRoom.getArea() > area) {
                System.out.println(meetingRoom.getName() +" (" + meetingRoom.getWidth()
                        + " * "  + meetingRoom.getLength() + " = " + meetingRoom.getArea() + ")");
    }
}

    public void printMeetingRoomsWithName() {
                    System.out.println("printMeetingRoomsWithName");
                    for (MeetingRoom meetingRoom: meetingRooms) {
                        System.out.println(meetingRoom.getName());
                }
    }

    public void printAreas() {
            System.out.println("printAreas");
            for (MeetingRoom meetingRooms meetingRooms) {
                System.out.println(meetingRoom.getName());
        }
    }
