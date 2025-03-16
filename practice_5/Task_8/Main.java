package practice_5.Task_8;

public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum();

//        museum.addExhibit(new Manuscript("Манускрипт Татунхамона"));
//        museum.showHistory();
//        museum.preserviseExhibit();

        museum.addExhibit(new Paint("Мона Лиза"));
        museum.showHistory();
        museum.preserviseExhibit();
    }
}
