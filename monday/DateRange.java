package Week2.monday;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateRange {
private LocalDateTime startDate;
private LocalDateTime endDate;

public DateRange(LocalDateTime startDateTime, LocalDateTime endDateTime){
    this.endDate = endDateTime;
    this.startDate = startDateTime;
}

public boolean isInRange(LocalDateTime date){
    int case1 = date.compareTo(startDate);
    int case2 = date.compareTo(endDate);

    if(case1>=0 && case2 <= 0){
        return true;
    }
    return false;
}

public static void getFirstDayOfMonth(LocalDate date){
    LocalDate prev = date.minusDays(1);
    System.out.println(date.minusDays(prev.getDayOfMonth()).getDayOfWeek());

    
}


}
