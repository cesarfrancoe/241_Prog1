class Ejer60 extends Terminal {

    public static void main(String[] args) {
        var curPlayer = 0; // Current player
        var dice = 0;
        var posPlayer = 0; // Current player position
        var posPlayer1 = 0; // Current user position
        var playerScore2 = 0;  // Current PC position
        var newPosPlayer = 0;

        printLine("*****************************************************");
        printLine("**** Bienvenido al juegos Escaleras y Serpientes ****");
        printLine("*****************************************************");
        printLine();

        while ((posPlayer1 < 100 && playerScore2 < 100) || (curPlayer == 1)) {
            if (curPlayer == 0) {
                posPlayer = posPlayer1;
                printLine("[TURNO DEL USUARIO]");
                printLine("Posicion actual: %d", posPlayer);
                print("Presione [ENTER] para lanzar el dado...");
                scanLine();
            } else {
                posPlayer = playerScore2;
                printLine("[TURNO DE LA COMPUTADORA]");
                printLine("Posicion actual: %d", posPlayer);
                printLine("Lanzando el dado...");
            }

            dice = (int) (1 + Math.random() * 6);
            printLine("Valor del dado: %d", dice);

            if (posPlayer + dice <= 100){
                posPlayer += dice;
                printLine("Nueva posición: %d", posPlayer);
            }else
                printLine("Perdió el turno");

            newPosPlayer = posPlayer;
            if (posPlayer == 10)
                newPosPlayer = 33;
            else if (posPlayer == 16)
                newPosPlayer = 37;
            else if (posPlayer == 21)
                newPosPlayer = 41;
            else if (posPlayer == 23)
                newPosPlayer = 2;
            else if (posPlayer == 34)
                newPosPlayer = 15;
            else if (posPlayer == 35)
                newPosPlayer = 54;
            else if (posPlayer == 44)
                newPosPlayer = 76;
            else if (posPlayer == 52)
                newPosPlayer = 31;
            else if (posPlayer == 62)
                newPosPlayer = 43;
            else if (posPlayer == 80)
                newPosPlayer = 99;
            else if (posPlayer == 89)
                newPosPlayer = 68;
            else if (posPlayer == 95)
                newPosPlayer = 74;

            if (newPosPlayer != posPlayer) {
                if (newPosPlayer < posPlayer)
                    printLine("Bajó por una serpiente");
                else if (newPosPlayer > posPlayer)
                    printLine("Subió por una escalera");

                posPlayer = newPosPlayer;
                printLine("Nueva posición: %d", newPosPlayer);
            }

            if (curPlayer == 0)
                posPlayer1 = posPlayer;
            else
                playerScore2 = posPlayer;

            printLine();

            curPlayer = (curPlayer + 1) % 2;
        }

        if (posPlayer1 == 100 && playerScore2 == 100)
            printLine("El usuario y la computadora empataron");
        else if (posPlayer1 == 100)
            printLine("El usuario ganó");
        else
            printLine("La computadora ganó");

    }

}