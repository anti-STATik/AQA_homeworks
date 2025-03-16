package practice_5.Task_8;

public class Museum {
    private Exhibit exhibit;

    public void addExhibit(Exhibit exhibit){
        this.exhibit = exhibit;
        System.out.println("Новый экспонат: " + exhibit.getName());
    }

    public void showHistory(){
        exhibit.provideHistory();
    }

    public void preserviseExhibit(){
        exhibit.ensurePreservation();
    }

}
