package SpringBootStart.SpringBootFirstProject.UserFiles;

public class helloWorldBean {
    String str;
    public helloWorldBean(String str){
        this.str = str;
    }

    public String getMessage() {
        return str;
    }

    @Override
    public String toString() {
        return str;
    }
}
