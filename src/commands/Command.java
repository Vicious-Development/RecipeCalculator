package commands;

public abstract class Command{
    public String id;
    public Command(String id){
        this.id=id;
    }
    public boolean matches(String str){
        return str.equals(id);
    }
    public abstract void execute(String... args);
}
