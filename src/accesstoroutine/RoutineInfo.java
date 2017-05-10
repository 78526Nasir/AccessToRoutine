package test5;

public class RoutineInfo {
    private String day;
    private final String time;
    private final String classRoomNumber;
    private final String courseCode;
    private final String teacherInitial;

    public RoutineInfo(String day, String time, String classRoomNumber, String courseCode, String teacherInitial) {
        this.day = day;
        this.time = time;
        this.classRoomNumber = classRoomNumber;
        this.courseCode = courseCode;
        this.teacherInitial = teacherInitial;
    }

    public String getDay(){
        return day;
    }
    
    public String getTime(){
        return time;
    }
    public String getClassRoomNumber(){
        return classRoomNumber;
    }
    public String getCourseCode(){
        return  courseCode;
    }
    public String getTeacherInitial(){
        return teacherInitial;
    }
            
}
