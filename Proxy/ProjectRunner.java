package Modul_five.Proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://github.com/AnastasiKotovich/WriteAndReedFile");

        project.run();
    }
}
