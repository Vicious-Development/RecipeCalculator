package commands;

import java.util.*;

public class CommandHandler {
    private Map<String,Command> commands = new HashMap<>();
    public void readLine(String str){
        StringBuilder val = new StringBuilder();
        Command toExecute = null;
        List<String> args = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(toExecute == null && commands.containsKey(val.toString())){
                toExecute=commands.get(val.toString());
                val = new StringBuilder();
                i++;
            }
            else if(c == ' ' || c == '\n'){
                args.add(val.toString());
                val=new StringBuilder();
            }
            else if(i == str.length()-1){
                args.add(val.toString());
            }
            else{
                val.append(c);
            }
        }
        toExecute.execute(args.toArray(new String[0]));
    }
}
