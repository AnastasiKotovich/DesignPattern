package Modul_five.Builder;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        //director.setBuilder(new VisitCardWebsite());
        director.setBuilder(new EnterpriceWebsite());
        Website website = director.builbWebsite();

        System.out.println(website);
    }
}
