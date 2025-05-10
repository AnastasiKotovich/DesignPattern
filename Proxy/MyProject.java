package Modul_five.Proxy;

public class MyProject implements Project{
    private String url;

    public MyProject(String url){
        this.url = url;
        load();
    }

    public void load(){
        System.out.println("Loading from " + url);
    }

    @Override
    public void run() {
        System.out.println("Running project " + url);
    }
}
