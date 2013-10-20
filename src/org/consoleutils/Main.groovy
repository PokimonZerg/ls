package org.consoleutils

import org.fusesource.jansi.AnsiConsole
import org.fusesource.jansi.Ansi
import org.fusesource.jansi.Ansi.Color.*

class Main {
    static void main(args) {
        AnsiConsole.systemInstall()
        
        def output = "ls version 0.01 based on Groovy\n"

        new File("").absoluteFile.listFiles().eachWithIndex({
                file, index -> output +=  new Ansi().fg(file.isDirectory() ? Ansi.Color.YELLOW : Ansi.Color.CYAN).a(file.getName().size() > 20 ? file.getName().substring(0, 17) + "..." : file.getName().padRight(20)).reset()
        })
        
        println(output)
    }  
}
