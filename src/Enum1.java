import java.time.LocalDateTime;

public class Enum1 {

    public static void main(String[] args) {
//        getSeason();
//        System.out.println(getSeason());
        switch (getSeason()) {
            case WINTER:
                System.out.println("It's Winter now, you need to dress warmly!");
                break;
            case SPRING:
                System.out.println(("It's Spring now, do not forget your hat!"));
                break;
            case SUMMER:
                System.out.println("It's Summer now, and very hot");
                break;
            case AUTUMN:
                System.out.println("It's Autumn, please put on a warm clothes");
                break;
            default:
                System.out.println("I can't recognize what is the month");
                break;
        }

    }

    public static Seasons getSeason() {
        LocalDateTime now = LocalDateTime.now();
        int month = now.getMonthValue();
        switch (month) {
            case 1:
            case 2:
            case 12:
                return Seasons.WINTER;
            case 3:
            case 4:
            case 5:
                return Seasons.SPRING;
            case 6:
            case 7:
            case 8:
                return Seasons.SUMMER;
            case 9:
            case 10:
            case 11:
                return Seasons.AUTUMN;
            default:
                return Seasons.UNRECOGNIZED;
        }

    }
}
