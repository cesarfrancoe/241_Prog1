class Ejer52 extends Terminal {
    public static void main(String[] args) {
        var nomJug1 = "Natasha";
        var nomJug2 = "Marie";
        var nomJug3 = "Anna";
        var nomJug4 = "Serena";
        var nomJug5 = "Sophie";
        var nomJug6 = "Lois";
        var nomJug7 = "Jane";
        var nomJug8 = "Janeth";
        var resPar = "";
        var ganPart1 = "";
        var ganPart2 = "";
        var ganPart3 = "";
        var ganPart4 = "";
        var ganPart5 = "";
        var ganPart6 = "";
        var ganPart7 = "";
        
        printLine("Ingrese el nombre de la jugadora #1:");
        //nomJug1 = scanLine();
        printLine("Ingrese el nombre de la jugadora #2:");
        //nomJug2 = scanLine();
        printLine("Ingrese el nombre de la jugadora #3:");
        //nomJug3 = scanLine();
        printLine("Ingrese el nombre de la jugadora #4:");
        //nomJug4 = scanLine();
        printLine("Ingrese el nombre de la jugadora #5:");
        //nomJug5 = scanLine();
        printLine("Ingrese el nombre de la jugadora #6:");
        //nomJug6 = scanLine();
        printLine("Ingrese el nombre de la jugadora #7:");
        // nomJug7 = scanLine();
        printLine("Ingrese el nombre de la jugadora #8:");
        //nomJug8 = scanLine();
        
        printLine("Ingrese el resultado del partido #1 (%s contra %s):", nomJug1, nomJug8);
        resPar = scanLine();
        if (resPar.equals("2-0") || resPar.equals("2-1"))
            ganPart1 = nomJug1;
        else
            ganPart1 = nomJug8;
        printLine("La ganadora del partido #1 es %s", ganPart1);
        
        printLine("Ingrese el resultado del partido #2 (%s contra %s):", nomJug2, nomJug7);
        resPar = scanLine();
        if (resPar.equals("2-0") || resPar.equals("2-1"))
            ganPart2 = nomJug2;
        else
            ganPart2 = nomJug7;
        printLine("La ganadora del partido #2 es %s", ganPart1);

        /* Continuar con los pardidos 3 y 4 */

        printLine("Ingrese el resultado del partido #5 (%s contra %s):", ganPart1, ganPart2);
        resPar = scanLine();
        if (resPar.equals("2-0") || resPar.equals("2-1"))
            ganPart5 = ganPart1;
        else
            ganPart5 = ganPart2;
        printLine("La ganadora del partido #5 es %s", ganPart5);

        /* Continuar con los pardidos 6 y 7 */
    }
}
