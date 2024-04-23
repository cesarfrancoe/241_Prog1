class Ejer38 extends Terminal {

    public static void main(String[] args) {
        var randNumber = 0;
        var number = 0;
                
        randNumber = (int) (1 + Math.random() * 15);

        printLine("Adivina el número");
        printLine("Introduce un número entre 1 y 15 (Intento 1):");
        number = Integer.parseInt(scanLine());

        if (number == randNumber) {
            printLine("¡Felicidades! Has adivinado el número");
        } else {
            if (number > randNumber) {
                printLine("!Fallaste! El número debe ser menor");
            } else {
                printLine("!Fallaste! El número debe ser mayor");
            }
            printLine("Introduce un número entre 1 y 15 (Intento 2):");
            number = Integer.parseInt(scanLine());

            if (number == randNumber) {
                printLine("¡Felicidades! Has adivinado el número");
            } else {
                if (number > randNumber) {
                    printLine("!Fallaste! El número debe ser menor");
                } else {
                    printLine("!Fallaste! El número debe ser mayor");
                }
                printLine("Introduce un número entre 1 y 15 (Intento 3):");
                number = Integer.parseInt(scanLine());

                if (number == randNumber) {
                    printLine("¡Felicidades! Has adivinado el número");
                } else {
                    printLine("¡Fallaste!");
                    printLine("El número era el %d", randNumber);
                }
            }
        }
    }
    
}
