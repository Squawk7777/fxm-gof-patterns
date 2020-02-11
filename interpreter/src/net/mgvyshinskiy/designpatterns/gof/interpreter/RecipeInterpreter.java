package net.mgvyshinskiy.designpatterns.gof.interpreter;

import net.mgvyshinskiy.designpatterns.gof.interpreter.commands.Command;
import net.mgvyshinskiy.designpatterns.gof.interpreter.commands.Stuff;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RecipeInterpreter {
    private RecipeInterpreter() {}

    public static List<Command> interpret(String recipe) {
        return Arrays.stream(recipe.split("-"))
                .map(ingredient -> new Stuff(Stuffing.valueOf(ingredient)))
                .collect(Collectors.toList());
    }
}
