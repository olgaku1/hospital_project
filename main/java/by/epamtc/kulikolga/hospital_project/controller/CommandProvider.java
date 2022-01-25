package by.epamtc.kulikolga.hospital_project.controller;

import by.epamtc.kulikolga.hospital_project.controller.commandImpl.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private static CommandProvider instance;
    private final Map<CommandName, Command> commands = new HashMap<>();

    public static CommandProvider getInstance() {
        if (instance == null) {
            instance = new CommandProvider();
        }
        return instance;
    }

    CommandProvider() {
        commands.put(CommandName.SIGN_IN, new SignIn());
        commands.put(CommandName.REGISTRATION, new Registration());
        commands.put(CommandName.SIGN_OUT, new SignOut());
        commands.put(CommandName.NO_COMMAND, new NoCommand());
    }

    public void setCommand(CommandName commandName, Command command) {
        commands.put(commandName, command);
    }

    public Command getCommand(HttpServletRequest request) {
        String action = request.getParameter("command");
        Command command = commands.get(action);
        if (command == null) {
            command = new NoCommand();
        }
        return command;
    }
}
