package test5;

import java.io.InputStream;
import java.util.Scanner;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {
    /*
     * all routine Objects !
    */
    static RoutineInfo routineInfo[] = new RoutineInfo[1000];
    static int countRoutineInfo=0;
    
    /*  The Main Sheet */
    static XSSFSheet sheet;
    
    // Effective From 8 October, 2016 Classroutine_Fall_2016 v 2.4.xlsx"
    InputStream f = getClass().getResourceAsStream("Classroutine_Fall_2016 v 2.4.xlsx");
    
    public void importRoutine(){
       try{
           XSSFWorkbook wbook = new XSSFWorkbook(f);
           sheet=wbook.getSheet("Sheet2");
       }catch(Exception e){
           
       }
    }
    
    static int cellNumberForRoomID=0;  // to do // update +=3
    static final int TIME_START_INDEX=5; // FIXED
    
    static final int DEFAULT_ROOM_CELL_ID=0;
    static int classRoomStartIndex; // for trace the class Room Number row field 
    static int classRoomEndIndex; // for trace the class room row Field after terminate one days method !
    static int cellNumber=1;// for count the cell the number 
    static int dayCount=0;// for count the day
    static int timeIndex=0; // to do // update in every schedule +=3
    static  int flagIndexForRoomID=0;
    
    static String[] DAYS={"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday"} ; // Fixed Days
    
    // scanner object !
    static Scanner scanf = new Scanner(System.in);
    static String bigData[]= new String[1000];
    
    /*
     * @ Program Will be start from Here !
     * @The Main Method 
    */
//    public static void main(String[] args) {
////        importRoutine();
////        setNameOfTheDay();
//        
//        Main m = new Main();
//        m.trySomething();
//        saturdayFirstSchedule();
//        
//        System.out.println("****************************************************** Routine Info ********************************************************");
//        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
//        System.out.println("\n\tClass Room\t\tCourse Code\t\tTeacher initial\t\tDay\t\tTime");
//        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
//        int sum = 1;
//        for(int i=0;i<countRoutineInfo;i++){
//            bigData[i]=(sum++)+"\t"+routineInfo[i].getClassRoomNumber()+"\t"+routineInfo[i].getCourseCode()+"\t"+routineInfo[i].getTeacherInitial()+"\t"+routineInfo[i].getDay()+"\t"+routineInfo[i].getTime();
////            System.out.printf("%d %15s\t\t%15s\t\t\t%10s\t%15s\t\t%-30s\n",sum++,routineInfo[i].getClassRoomNumber(),routineInfo[i].getCourseCode(),routineInfo[i].getTeacherInitial(),routineInfo[i].getDay(),routineInfo[i].getTime());
//      
//        }
//        
//    }

    
       
    /*
     * import the routine file (.xlsx) from my computer !
    */
//    public static void importRoutine(){
//        File f = new File("ClassRoutine_Fall15_V1_NoColor.xlsx");
//        try {
//            FileInputStream fileInputStream=new FileInputStream(f);
//            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
//            sheet = workbook.getSheet("Sheet1");
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
    
    /*
     * Retrive Some information from the Rouine File !
    */
//    public static void getRoutineInfo(){
//        String routineInfo;
//        routineInfo=sheet.getRow(0).getCell(0).getStringCellValue();
//        System.out.println(routineInfo);
//        routineInfo=sheet.getRow(21).getCell(0).getStringCellValue();
//        System.out.println(routineInfo);
//        
//    }

   
    /*
     * This method will check the day! then Call apropriate method according ti the day! 
    */
//    public static void checkDayAndCallSchedule(){
//        for(String day : days){
//            if(day.equalsIgnoreCase("Saturday")){
//                saturdayFirstSchedule();
//                
//                
//            }
//            
//           // dayCount++; // update day
//        }
//    }
    
   
    
    /*
     * @ Saturday Routine Info storing Process Started Here !
     * @ saturday First Schedule Start Here 
     * @ Saturday First Schedule !
    */
    public static void saturdayFirstSchedule(){
        // fixed time 
        String timeForFirstSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        
        classRoomStartIndex=7; 
        
        for(int i=0;i<1000;i++){
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();
            
            if(forTerminate.contains("Sunday")){
                cellNumber+=3;
                classRoomEndIndex=countRoutineInfo+classRoomStartIndex+1;   // 22
                cellNumberForRoomID+=3;
                timeIndex+=3;  // second schedule Time
                flagIndexForRoomID=0; // reset
                
                saturdaySecondSchedule();  // // -> Saturday Second Schedule Called !
                
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForFirstSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);
            
            cellNumber=1; // reset the cell number
            flagIndexForRoomID++;
            
        }
        
     
    }
    
    
    /*
     * @ saturday Second Schedule Start Here 
     * @ Saturday Second Schedule!
    */
    public static void saturdaySecondSchedule(){

        String timeForSecondSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        
        for(int i=countRoutineInfo;i<1000;i++){
            
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();

            if(forTerminate.contains("Sunday")){ 
                cellNumber+=3;
                timeIndex+=3;  // Third schedule Time
                cellNumberForRoomID+=3;
                flagIndexForRoomID=0; // reset
                
                saturdayThirdSchedule();  // -> Saturday Third Schedule Called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForSecondSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);
              
            // reset the cell number
            cellNumber=4;
            flagIndexForRoomID++;
        }
    }
    
    
    
    
    /*
     * @ saturday Third Schedule Start Here 
     * @ Satuday Third Schedule !
    */
    public static void saturdayThirdSchedule(){
        String timeForThirdSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        
        for(int i=countRoutineInfo;i<1000;i++){
            
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();

            if(forTerminate.contains("Sunday")){ 
                cellNumber+=3;
                timeIndex+=3;  // Fourth schedule Time
                flagIndexForRoomID=0; // reset
                cellNumberForRoomID+=3;
                saturdayFourthSchedule();  // -> sunday Fourth Schedule Called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForThirdSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);

            // reset the cell number
            cellNumber=7;
            flagIndexForRoomID++;
        }
    }
    
    
    
    
    /*
     * @ saturday Fourth Schedule Start Here 
     * @ Saturday Fourth Schedule !
    */
    public static void saturdayFourthSchedule(){
        String timeForFourthSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        
        for(int i=countRoutineInfo;i<1000;i++){
            
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();

            if(forTerminate.contains("Sunday")){ 
                cellNumber+=3;
                timeIndex+=3;  // Fifth schedule Time
                flagIndexForRoomID=0; // reset
                cellNumberForRoomID+=3;
                
                saturdayFifthSchedule();  // -> Saturday Fifth Schedule Called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForFourthSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);
           
            // reset the cell number
            cellNumber=10;
            flagIndexForRoomID++;
        }
    }
    
    /*
     * @ saturday Fifth Schedule Start Here 
     * @ Saturday Fifth Schedule !
    */
    
    public static void saturdayFifthSchedule(){
        String timeForFifthSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        
        for(int i=countRoutineInfo;i<1000;i++){
            
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();

            if(forTerminate.contains("Sunday")){ 
                cellNumber+=3;
                timeIndex+=3;
                flagIndexForRoomID=0; // reset
                cellNumberForRoomID+=3;
                
                saturdaySixthSchedule(); // -> Saturday Sixth Schedule Called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForFifthSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);
            
            // reset the cell number
            cellNumber=13;
            flagIndexForRoomID++;
        }
    }
    
    
    /*
     * @ saturday Sixth Schedule Start Here 
     * @ Saturday Sixth Schedule !
    */
    
    public static void saturdaySixthSchedule(){
        String timeForSixthSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        
        for(int i=countRoutineInfo;i<1000;i++){
            
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();

            if(forTerminate.contains("Sunday")){ 
                cellNumber=1; // reset
                dayCount++; // Sunday!
                timeIndex=0;  // reset
                flagIndexForRoomID=0; // reset
                cellNumberForRoomID=0; // reset
                
                sundayFirstSchedule(); // -> sunday First Schedule Called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForSixthSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);
            
            // reset the cell number
            cellNumber=16;
            flagIndexForRoomID++;
        }
    }
    
    
    
    
    
    /*
     * @ Sunday Routine Info storing Process Started Here !
     * @ Sunday First Schedule Start Here 
     * @ Sunday First Schedule !
    */    
    
    public static void sundayFirstSchedule(){
        // fixed time 
        String timeForFirstSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        classRoomStartIndex=classRoomEndIndex;  // now it's on 23th row 
        
        for(int i=countRoutineInfo;i<1000;i++){
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();
            
            if(forTerminate.contains("Monday")){
                cellNumber+=3;
                timeIndex+=3;  // second schedule Time
                flagIndexForRoomID=0; // reset
                cellNumberForRoomID+=3;
                sundaySecondSchedule();  // -> sunday Second Schedule Called!
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForFirstSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);

            cellNumber=1; // reset the cell number
            flagIndexForRoomID++;
            
        }
    }
    
    
    /*
     * @ Sunday Second Schedule Start Here 
     * @ Sunday Second Schedule !
    */
    
    
    public static void sundaySecondSchedule(){
        String timeForSecondSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        
        for(int i=countRoutineInfo;i<1000;i++){
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();

            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();
            
            if(forTerminate.contains("Monday")){
                cellNumber+=3;
                timeIndex+=3;  // Third schedule Time
                flagIndexForRoomID=0; // reset
                cellNumberForRoomID+=3;
                
                sundayThirdSchedule(); // ->  sunday third schedule called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForSecondSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);
            
            cellNumber=4; // reset the cell number
            flagIndexForRoomID++;
            
        }
    }
    
    
    
    /*
     * @ Sunday Third Schedule Start Here 
     * @ Sunday Third Schedule !
    */
    
    public static void sundayThirdSchedule(){
        String timeForThirdSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        
        for(int i=countRoutineInfo;i<1000;i++){
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();
            
            if(forTerminate.contains("Monday")){
                cellNumber+=3;
                timeIndex+=3;  // Fourth schedule Time
                flagIndexForRoomID=0; // reset
                cellNumberForRoomID+=3;
                
                sundayFourthSchedule(); // ->  sunday Fourth schedule called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForThirdSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);

            cellNumber=7; // reset the cell number
            flagIndexForRoomID++;
            
        }
        
    }
    
    
    
    /*
     * @ Sunday Fourth Schedule Start Here 
     * @ Sunday Fourth Schedule !
    */
    public static void sundayFourthSchedule(){
        String timeForFourthSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        
        for(int i=countRoutineInfo;i<1000;i++){
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();
            
            if(forTerminate.contains("Monday")){
                cellNumber+=3;
                timeIndex+=3;  // Fifth schedule Time
                flagIndexForRoomID=0; // reset
                cellNumberForRoomID+=3;
                
                sundayFifthSchedule(); // ->  sunday Fifth schedule called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForFourthSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);
            
            cellNumber=10; // reset the cell number
            flagIndexForRoomID++;
            
        }
    }
    
    
    /*
     * @ Sunday Fifth Schedule Start Here 
     * @ Sunday Fifth Schedule !
    */
    public static void sundayFifthSchedule(){
        String timeForFifthSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        
        for(int i=countRoutineInfo;i<1000;i++){
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();
            
            if(forTerminate.contains("Monday")){
                cellNumber+=3;
                timeIndex+=3;  // Sixth schedule Time
                flagIndexForRoomID=0; // reset
                cellNumberForRoomID+=3;
                
                sundaySixthSchedule(); // ->  sunday Sixth schedule called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForFifthSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);
            
            cellNumber=13; // reset the cell number
            flagIndexForRoomID++;
            
        }
    }
    
    
    /*
     * @ Sunday Sixth Schedule Start Here 
     * @ Sunday Sixth Schedule !
    */
    public static void sundaySixthSchedule(){
        String timeForSixthSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();

        for(int i=countRoutineInfo;i<1000;i++){
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();
            
            if(forTerminate.contains("Monday")){
                cellNumber=1; // reset 
                classRoomEndIndex=classRoomStartIndex+flagIndexForRoomID+1;  // class room index now 35th row //34
                timeIndex=0;  // reset
                cellNumberForRoomID=0; // reset
                dayCount++;
                flagIndexForRoomID=0; // reset
                
                mondayFirstSchedule(); // ->  Monday First schedule called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForSixthSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);

            cellNumber=16; // reset the cell number
            flagIndexForRoomID++;
            
        }
    }
    
    
    /*
     * @ Monday Routine Info storing Process Started Here !
     * @ Monday First Schedule Start Here 
     * @ Monday First Schedule !
    */   
    
    public static void mondayFirstSchedule(){
        String timeForFirstSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        classRoomStartIndex=classRoomEndIndex;  // 34
        
        for(int i=countRoutineInfo;i<1000;i++){
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();
            
            if(forTerminate.contains("Tuesday")){
                cellNumber+=3;  
                timeIndex+=3;  
                flagIndexForRoomID=0; // reset
                cellNumberForRoomID+=3;
                
                mondaySecondSchedule(); // ->  Monday Second schedule called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForFirstSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);

            cellNumber=1; // reset the cell number
            flagIndexForRoomID++;
            
        }
    }
 
    
    
    /*
     * @ Monday Second Schedule Start Here 
     * @ Monday Second Schedule !
    */
    public static void mondaySecondSchedule(){
        String timeForSecondSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        
        for(int i=countRoutineInfo;i<1000;i++){
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();
            
            if(forTerminate.contains("Tuesday")){
                cellNumber+=3;  
                timeIndex+=3;  
                flagIndexForRoomID=0; // reset
                cellNumberForRoomID+=3;
                
                mondayThirdSchedule(); // ->  Monday Third schedule called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForSecondSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);
           
            cellNumber=4; // reset the cell number
            flagIndexForRoomID++;
            
        }
    }
    
    
    
    /*
     * @ Monday Third Schedule Start Here 
     * @ Monday Third Schedule !
    */
    
    public static void mondayThirdSchedule(){
        String timeForThirdSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        
        for(int i=countRoutineInfo;i<1000;i++){
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();
            
            if(forTerminate.contains("Tuesday")){
                cellNumber+=3;  
                timeIndex+=3;  
                flagIndexForRoomID=0; // reset
                cellNumberForRoomID+=3;

                mondayFourthSchedule(); // ->  Monday Fourth schedule called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForThirdSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);
           
            cellNumber=7; // reset the cell number
            flagIndexForRoomID++;
        
        }
    
    }
    
    
    
    
    /*
     * @ Monday Fourth Schedule Start Here 
     * @ Monday Fourth Schedule !
    */
    
    public static void mondayFourthSchedule(){
        String timeForFourthSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        
        for(int i=countRoutineInfo;i<1000;i++){
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();
            
            if(forTerminate.contains("Tuesday")){
                cellNumber+=3;  
                timeIndex+=3;  
                flagIndexForRoomID=0; // reset
                cellNumberForRoomID+=3;
                
                mondayFifthSchedule(); // ->  Monday Fifth schedule called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForFourthSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);
            
            cellNumber=10; // reset the cell number
            flagIndexForRoomID++;
        
        }
    }
    
    
    /*
     * @ Monday Fifth Schedule Start Here 
     * @ Monday Fifth Schedule !
    */
    public static void mondayFifthSchedule(){
        String timeForFifthSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        
        for(int i=countRoutineInfo;i<1000;i++){
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();
            
            if(forTerminate.contains("Tuesday")){
                cellNumber+=3;  
                timeIndex+=3;  
                flagIndexForRoomID=0; // reset
                cellNumberForRoomID+=3;
                
                mondaySixthSchedule(); // ->  Monday Sixth schedule called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForFifthSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);
            
            cellNumber=13; // reset the cell number
            flagIndexForRoomID++;
        
        }
        
    }
    
    
    /*
     * @ Monday Sixth Schedule Start Here 
     * @ Monday Sixth Schedule !
    */
    public static void mondaySixthSchedule(){
        String timeForSixthSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        
        for(int i=countRoutineInfo;i<1000;i++){
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();
            
            if(forTerminate.contains("Tuesday")){
                classRoomEndIndex=classRoomStartIndex+flagIndexForRoomID+1;
                cellNumber=1;  // reset
                timeIndex=0 ;  // reset
                dayCount++; // tuesday
                flagIndexForRoomID=0; // reset
                cellNumberForRoomID=0; // reset
                
                tuesdayFirstSchedule(); // ->  Tuesday First schedule called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForSixthSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);
            
            cellNumber=16; // reset the cell number
            flagIndexForRoomID++;
        
        }
    }
    
    
    /*
     * @ Tuesday Routine Info storing Process Started Here !
     * @ Tuesday First Schedule Start Here 
     * @ Tuesday First Schedule !
    */  
    
    
    public static void tuesdayFirstSchedule(){
        String timeForFirstSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        classRoomStartIndex=classRoomEndIndex;  //48
        
        for(int i=countRoutineInfo;i<1000;i++){
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();
            
            if(forTerminate.contains("Wednesday")){
                cellNumber+=3;  
                timeIndex+=3;  
                flagIndexForRoomID=0; // reset
                cellNumberForRoomID+=3;
                
                tuesdaySecondSchedule(); // ->  Tuesday Second schedule called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForFirstSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);
            
            cellNumber=1; // reset the cell number
            flagIndexForRoomID++;
            
        }
    }
    
    
    /*
     * @ Tuesday Second Schedule Start Here 
     * @ Tuesday Second Schedule !
    */
    
    public static void tuesdaySecondSchedule(){
        String timeForSecondSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        
        for(int i=countRoutineInfo;i<1000;i++){
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();
            
            if(forTerminate.contains("Wednesday")){
                cellNumber+=3;  
                timeIndex+=3;  
                flagIndexForRoomID=0; // reset
                cellNumberForRoomID+=3;
                
                tuesdayThirdSchedule(); // ->  Tueday Third schedule called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForSecondSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);
            
            cellNumber=4; // reset the cell number
            flagIndexForRoomID++;
            
        }
    }
    
    
    
    /*
     * @ Tuesday Third Schedule Start Here 
     * @ Tuesday Third Schedule !
    */
    
    public static void tuesdayThirdSchedule(){
        String timeForThirdSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        
        for(int i=countRoutineInfo;i<1000;i++){
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();
            
            if(forTerminate.contains("Wednesday")){
                cellNumber+=3;  
                timeIndex+=3;  
                flagIndexForRoomID=0; // reset
                cellNumberForRoomID+=3;
                
                tuesdayFourthSchedule(); // ->  Tuesday Fourth schedule called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForThirdSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);
           
            cellNumber=7; // reset the cell number
            flagIndexForRoomID++;
        
        }
    }
    
    
    
    /*
     * @ Tuesday Fourth Schedule Start Here 
     * @ Tuesday Fourth Schedule !
    */
    
    public static void tuesdayFourthSchedule(){
        String timeForFourthSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        
        for(int i=countRoutineInfo;i<1000;i++){
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();
            
            if(forTerminate.contains("Wednesday")){
                cellNumber+=3;  
                timeIndex+=3;  
                flagIndexForRoomID=0; // reset
                cellNumberForRoomID+=3;
                
                tuesdayFifthSchedule(); // ->  Tuesday Fifth schedule called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForFourthSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);
            
            cellNumber=10; // reset the cell number
            flagIndexForRoomID++;
        
        }
    }
    
    
    
    /*
     * @ Tuesday Fifth Schedule Start Here 
     * @ Tuesday Fifth Schedule !
    */
    public static void tuesdayFifthSchedule(){
        String timeForFifthSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        
        for(int i=countRoutineInfo;i<1000;i++){
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();
            
            if(forTerminate.contains("Wednesday")){
                cellNumber+=3;  
                timeIndex+=3;  
                flagIndexForRoomID=0; // reset
                cellNumberForRoomID+=3;
                
                tuesdaySixthSchedule(); // ->  Tuesday Sixth schedule called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForFifthSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);
            
            cellNumber=13; // reset the cell number
            flagIndexForRoomID++;
        
        }
    }
    
    
    /*
     * @ Tuesday Sixth Schedule Start Here 
     * @ Tuesday Sixth Schedule !
    */
    public static void tuesdaySixthSchedule(){
        String timeForSixthSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        
        for(int i=countRoutineInfo;i<1000;i++){
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();
            
            if(forTerminate.contains("Wednesday")){
                classRoomEndIndex=classRoomStartIndex+flagIndexForRoomID+1;
                cellNumber=1;  // reset
                timeIndex=0 ;  // reset
                dayCount++; // Wednesday
                flagIndexForRoomID=0; // reset
                cellNumberForRoomID=0; // reset
                
                wednesdayFirstSchedule(); // ->  Wednesday First schedule called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForSixthSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);
            
            cellNumber=16; // reset the cell number
            flagIndexForRoomID++;
        
        }
    }
    
    
     
    /*
     * @ Wednesday Routine Info storing Process Started Here !
     * @ Wednesday First Schedule Start Here 
     * @ Wednesday First Schedule !
    */  
    public static void wednesdayFirstSchedule(){
        String timeForFirstSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        classRoomStartIndex=classRoomEndIndex;  // 62
        
        
        for(int i=countRoutineInfo;i<1000;i++){
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();
            
            if(forTerminate.contains("Thrusday")){
                cellNumber+=3;  
                cellNumberForRoomID+=3;
                timeIndex+=3;  
                flagIndexForRoomID=0; // reset
                
                wednesdaySecondSchedule(); // ->  Wednesday Second schedule called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForFirstSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);
            
            cellNumber=1; // reset the cell number
            flagIndexForRoomID++;
            
        }
    }
    
    
    
    /*
     * @ Wednesday Second Schedule Start Here 
     * @ Wednesday Second Schedule !
    */
    public static void wednesdaySecondSchedule(){
        String timeForSecondSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        
        for(int i=countRoutineInfo;i<1000;i++){
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();
            
            if(forTerminate.contains("Thrusday")){
                cellNumber+=3;  
                cellNumberForRoomID+=3;
                timeIndex+=3;  
                flagIndexForRoomID=0; // reset
                
                wednesdayThirdSchedule(); // ->  Wednesday Third schedule called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForSecondSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);
            
            cellNumber=4; // reset the cell number
            flagIndexForRoomID++;
            
        }
    }
    
    
    
    
    /*
     * @ Wednesday Third Schedule Start Here 
     * @ Wednesday Third Schedule !
    */
    public static void wednesdayThirdSchedule(){
        String timeForThirdSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        
        for(int i=countRoutineInfo;i<1000;i++){
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();
            
            if(forTerminate.contains("Thrusday")){
                cellNumber+=3;  
                timeIndex+=3;  
                cellNumberForRoomID+=3;
                flagIndexForRoomID=0; // reset
                
                wednesdayFourthSchedule(); // ->  Wednesday Fourth schedule called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForThirdSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);
           
            cellNumber=7; // reset the cell number
            flagIndexForRoomID++;
        
        }
        
    }
    
    

    /*
     * @ Wednesday Fourth Schedule Start Here 
     * @ Wednesday Fourth Schedule !
    */
    public static void wednesdayFourthSchedule(){
        String timeForFourthSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        
        for(int i=countRoutineInfo;i<1000;i++){
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();

            if(forTerminate.contains("Thrusday")){
                cellNumber+=3;  
                timeIndex+=3;  
                cellNumberForRoomID+=3;
                flagIndexForRoomID=0; // reset
                
                wednesdayFifthSchedule(); // ->  Wednesday Fifth schedule called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForFourthSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);
            
            cellNumber=10; // reset the cell number
            flagIndexForRoomID++;
        
        }
    }
    
    
    

    /*
     * @ Wednesday Fifth Schedule Start Here 
     * @ Wednesday Fifth Schedule !
    */
    public static void wednesdayFifthSchedule(){
        String timeForFifthSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        
        for(int i=countRoutineInfo;i<1000;i++){
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();
            
            if(forTerminate.contains("Thrusday")){
                cellNumber+=3;  
                timeIndex+=3;  
                flagIndexForRoomID=0; // reset
                cellNumberForRoomID+=3;
                
                wednesdaySixthSchedule(); // ->  Tuesday Sixth schedule called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForFifthSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);
            
            cellNumber=13; // reset the cell number
            flagIndexForRoomID++;
        
        }
    }
    
    
    
   
    /*
     * @ Wednesday Sixth Schedule Start Here 
     * @ Wednesday Sixth Schedule !
    */
    public static void wednesdaySixthSchedule(){
        String timeForSixthSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        
        for(int i=countRoutineInfo;i<1000;i++){
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();
            
            if(forTerminate.contains("Thrusday")){
                classRoomEndIndex=classRoomStartIndex+flagIndexForRoomID+1;
                cellNumber=1;  // reset
                timeIndex=0 ;  // reset
                dayCount++; // Wednesday
                flagIndexForRoomID=0; // reset
                cellNumberForRoomID=0; // reset
                
                thursdayFirstSchedule(); // ->  Thursday First schedule called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForSixthSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);
             
            cellNumber=16; // reset the cell number
            flagIndexForRoomID++;
        
        }
    }
    
    
    
    
    /*
     * @ Thursday Routine Info storing Process Started Here !
     * @ Thursday First Schedule Start Here 
     * @ Thursday First Schedule !
    */  
    public static void thursdayFirstSchedule(){
        String timeForFirstSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        classRoomStartIndex=classRoomEndIndex;  // 62
        
        
        for(int i=countRoutineInfo;i<1000;i++){
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();
            
            if(forTerminate.contains("List")){
                cellNumber+=3;  
                cellNumberForRoomID+=3;
                timeIndex+=3;  
                flagIndexForRoomID=0; // reset
                
                thursdaySecondSchedule(); // ->  Thurday Second schedule called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForFirstSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);
           
            cellNumber=1; // reset the cell number
            flagIndexForRoomID++;
            
        }
    }
    
    
    /*
     * @ Thursday Second Schedule Start Here 
     * @ Thursday Second Schedule !
    */
    public static void thursdaySecondSchedule(){
        String timeForSecondSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        
        for(int i=countRoutineInfo;i<1000;i++){
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();
            
            if(forTerminate.contains("List")){
                cellNumber+=3;  
                cellNumberForRoomID+=3;
                timeIndex+=3;  
                flagIndexForRoomID=0; // reset
                
                thursdayThirdSchedule(); // ->  Thursday Third schedule called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForSecondSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);
           
            cellNumber=4; // reset the cell number
            flagIndexForRoomID++;
            
        }
    }
    
    
    /*
     * @ Thursday Third Schedule Start Here 
     * @ Thursday Third Schedule !
    */
    public static void thursdayThirdSchedule(){
        String timeForThirdSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        
        for(int i=countRoutineInfo;i<1000;i++){
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();
            
            if(forTerminate.contains("List")){
                cellNumber+=3;  
                timeIndex+=3;  
                cellNumberForRoomID+=3;
                flagIndexForRoomID=0; // reset
                
                thursdayFourthSchedule(); // ->  Thursday Fourth schedule called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForThirdSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);
            
            
            cellNumber=7; // reset the cell number
            flagIndexForRoomID++;
        
        }
    }
    
    
    
    /*
     * @ Thursday Fourth Schedule Start Here 
     * @ Thursday Fourth Schedule !
    */
    public static void thursdayFourthSchedule(){
        String timeForFourthSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        
        for(int i=countRoutineInfo;i<1000;i++){
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();
            
            if(forTerminate.contains("List")){
                cellNumber+=3;  
                timeIndex+=3;  
                cellNumberForRoomID+=3;
                flagIndexForRoomID=0; // reset
                
                thursdayFifthSchedule(); // ->  Thursday Fifth schedule called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForFourthSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);
            
            cellNumber=10; // reset the cell number
            flagIndexForRoomID++;
        
        }
    }
    
    
    
    /*
     * @ Thursday Fifth Schedule Start Here 
     * @ Thursday Fifth Schedule !
    */
    public static void thursdayFifthSchedule(){
        String timeForFifthSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        
        for(int i=countRoutineInfo;i<1000;i++){
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();
            
            if(forTerminate.contains("List")){
                cellNumber+=3;  
                timeIndex+=3;  
                flagIndexForRoomID=0; // reset
                cellNumberForRoomID+=3;
                
                thursdaySixthSchedule(); // ->  Thursday Sixth schedule called !
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForFifthSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);
            
            cellNumber=13; // reset the cell number
            flagIndexForRoomID++;
        
        }
    }
    
    
    
    /*
     * @ Thursday Sixth Schedule Start Here 
     * @ Thursday Sixth Schedule !
    */
    public static void thursdaySixthSchedule(){
        String timeForSixthSchedule=sheet.getRow(TIME_START_INDEX).getCell(timeIndex).getStringCellValue();
        
        for(int i=countRoutineInfo;i<1000;i++){
            String retriveTempCourseCode;
            String retriveTempTeacherInitial;
            String forTerminate=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(DEFAULT_ROOM_CELL_ID).getStringCellValue();
            
            String retriveTempClassRoomNumber=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumberForRoomID).getStringCellValue();
            
            if(forTerminate.contains("List")){
//                classRoomEndIndex=classRoomStartIndex+flagIndexForRoomID+1;
//                cellNumber=1;  // reset
//                timeIndex=0 ;  // reset
//                flagIndexForRoomID=0; // reset
//                cellNumberForRoomID=0; // reset
                
                break;
            }
            
            /* 
             * if the Cell Null then this try-catch block handle the Null pointer Exception ! and store blank/empty data for this cell !
            */
            try{
                retriveTempCourseCode=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber++).getStringCellValue();
                retriveTempTeacherInitial=sheet.getRow(classRoomStartIndex+flagIndexForRoomID).getCell(cellNumber).getStringCellValue();  
            }catch(Exception e){
                retriveTempCourseCode="";
                retriveTempTeacherInitial="";
            }

            // making objects
            routineInfo[countRoutineInfo++]=new RoutineInfo(DAYS[dayCount], timeForSixthSchedule, retriveTempClassRoomNumber, retriveTempCourseCode,retriveTempTeacherInitial);
            
            cellNumber=16; // reset the cell number
            flagIndexForRoomID++;
        
        }
    }
    
}
