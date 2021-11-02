public class enum1 {
    enum days{
        MONDAY,
        TUESDAY,
        WEDNUSDAY,
        THRUSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
    public static void main(String[] args) {
    System.out.println("Days of the weekend are:-");
    for (days weekdays:days.values()) {
        System.out.println(weekdays);
    }
    days myday=days.WEDNUSDAY;
    System.out.println(myday);
    System.out.println("TIMETABLE OF THE WEEKEND");
    switch (myday) {
        case MONDAY:
            System.out.println("MONDAY:-movie day");
            break;   
            case TUESDAY:
            System.out.println("TUESDAY:-JAVA COURSE");
            break;
           case WEDNUSDAY:
            System.out.println("WEDNUSDAY:-computer class");
            break;
            case THRUSDAY:
            System.out.println("THRUSDAY:-PROJECT WORK");
            break;
            case FRIDAY:
            System.out.println("FRIDAY:-OUTING DAY");
            break;
            case SATURDAY:
            System.out.println("SATURDAY:-JAVA PROGRAM");
            break;
            case SUNDAY:
            System.out.println("SUNDAY:-FREE TO DO ANYTHING");
            break;
    
        default:
        System.out.println("MR NOBODY DAY:-FREE TO GO ANYWHERE");
            break; 
    }
    }
}
